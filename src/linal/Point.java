package linal;

public class Point implements Comparable<Point> {
    
    private final double X, Y;
    public static Point origin = new Point(0, 0);

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println("Create point p: " + p.toString());
        Point p1 = new Point(2, 2.2);
        System.out.println("Create point p1: " + p1.toString());
        System.out.println("Distance between p and p1: " + p1.distanceTo(p));
        System.out.println("Distance between p1 and origin: " + p1.distanceTo(origin));
        System.out.println("p1 equals p: " + p1.equals(p));
        System.out.println("p1 equals p1: " + p1.equals(p1));
        System.out.println("p1 compared to p: " + p1.compareTo(p));
    }

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    @Override 
    public int hashCode() {
        return (String.valueOf(this.X) + String.valueOf(this.Y)).hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() != this.getClass()) return false;
        if (this == other) return true;
        return (this.X == ((Point) other).getX() && this.Y == ((Point) other).getY());
    }

    @Override
    public int compareTo(Point other) {
        // compare by distance to (0, 0)
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
        return "(" + String.valueOf(this.X) + ", " + String.valueOf(this.Y) + ")";
    }

    public double distanceTo(Point p) {
        double dx = this.X - p.getX();
        double dy = this.Y - p.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }
}
