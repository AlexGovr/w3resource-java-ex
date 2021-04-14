package linal;

public class Point3d implements Comparable<Point3d> {
    
    private final double X, Y, Z;
    public static Point3d origin = new Point3d(0, 0, 0);

    public Point3d(double x, double y, double z) {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }

    @Override 
    public int hashCode() {
        return (String.valueOf(this.X) + String.valueOf(this.Y) + String.valueOf(this.Z)).hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() != this.getClass()) return false;
        if (this == other) return true;
        double _x = ((Point3d) other).getX();
        double _y = ((Point3d) other).getY();
        double _z = ((Point3d) other).getZ();
        return (this.X == _x && this.Y == _y && this.Z == _z);
    }

    @Override
    public int compareTo(Point3d other) {
        // compare by distance to (0, 0, 0)
        double dist = distanceTo(origin);
        double otherDist = other.distanceTo(origin);
        if (dist > otherDist) {
            return 1;
        } else if (dist == otherDist) {
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", this.Y, this.Y, this.Z);
    }

    public double distanceTo(Point3d p) {
        double dx = this.X - p.getX();
        double dy = this.Y - p.getY();
        double dz = this.Z - p.getZ();
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }

    public double getZ() {
        return this.Z;
    }
}