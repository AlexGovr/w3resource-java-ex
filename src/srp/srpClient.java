package srp;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import sber.srp.SrpCalcM;
import sber.srp.SrpReg;

public class srpClient {
    public static void main(String args[]) throws NoSuchAlgorithmException, IOException {
        String u = args[0];
        String psw = args[1];
        
        byte[] randomBytes = SrpReg.generateRandomBytes(80);
        BigInteger bigInt1 = new BigInteger(1, SrpReg.hash(new byte[][] { randomBytes, psw.getBytes() }));
        BigInteger verifBigInt = SrpReg.G.modPow(bigInt1, SrpReg.N);
        BigInteger clisecretBigInt = SrpReg.generateRandom(256);
        BigInteger clipublicBigInt = SrpReg.G.modPow(clisecretBigInt, SrpReg.N);

        String salt = SrpReg.toHexString(randomBytes);
        String verifier = SrpReg.toHexString(SrpReg.bigIntToBytes(verifBigInt));
        String clipublic = SrpReg.toHexString(SrpReg.bigIntToBytes(clipublicBigInt));
        String clisecret = SrpReg.toHexString(SrpReg.bigIntToBytes(clisecretBigInt));

        String[] _args = {u, psw, salt, clipublic, clisecret, verifier};
        String M = calcm(_args);

        // for testing
        System.out.println("Salt:" + salt);
        System.out.println("ClientPublicKey:" + clipublic);
        System.out.println("ClientSecretKey:" + clisecret);
        System.out.println("Verifier:" + verifier);

        System.out.println("M:" + M);
    }

    public static String calcm(String[] args) throws IOException, NoSuchAlgorithmException {
        String user = args[0];
        String pasw = args[1];
        BigInteger K = SrpCalcM.K;
        BigInteger N = SrpCalcM.N;
        BigInteger G = SrpCalcM.G;

        byte[] arrayOfByte1 = SrpCalcM.fromHexString(args[2]);
        BigInteger bigInt1 = new BigInteger(1, SrpCalcM.hash(new byte[][] { arrayOfByte1, pasw.getBytes() }));
        BigInteger bigInt2 = G.modPow(bigInt1, N);
        String clisecret = args[4];
        String clipublic = args[3];
        BigInteger bigInt3 = new BigInteger(clisecret, 16);
        BigInteger bigInt4 = new BigInteger(clipublic, 16);
        BigInteger bigInt5 = bigInt3;
        BigInteger bigInt6 = G.modPow(bigInt5, N);

        if (!bigInt6.equals(bigInt4))
          throw new IllegalArgumentException("Client public key doesn't correspond to client secret!"); 

        String verifier = args[5];
        BigInteger bigInt7 = new BigInteger(verifier, 16);
        BigInteger bigInt8 = SrpCalcM.calculateU(SrpCalcM.bigIntToBytes(bigInt6), SrpCalcM.bigIntToBytes(bigInt7));
        BigInteger bigInt9 = bigInt7.subtract(bigInt2.multiply(K)).modPow(bigInt8.multiply(bigInt1).add(bigInt5), N);
        byte[] arrayOfByte4 = SrpCalcM.hash(new byte[][] { SrpCalcM.bigIntToBytes(bigInt9) });
        byte[] byteM = SrpCalcM.calculateM(arrayOfByte4, user, bigInt6, bigInt7, arrayOfByte1);

        return SrpCalcM.toHexString(byteM);
      }
}
