package srp;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

// import sber.srp.SrpCalcM;
import sber.srp.SrpReg;

public class srpClient {
    public static void main(String args[]) throws NoSuchAlgorithmException, IOException {
        String psw = "12345qwrety";
        String u = "alex";
        String[] _args = {u, psw};
        SrpReg.main(_args);
    }
}
