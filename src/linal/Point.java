package linal;

public class Point implements Comparable<Point> {
    
    private final double X, Y;
    public static Point origin = new Point(0, 0);

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    @Override 
    public int hashCode() {
        int h = 17;
        h += 31 * h + String.valueOf(this.X).hashCode();
        h += 31 * h + String.valueOf(this.Y).hashCode();
        return h;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other.getClass() != this.getClass()) return false;
        if (this == other) return true;
        return (this.X == ((Point) other).getX() && this.Y == ((Point) other).getY());
    }

    @Override
    public int compareTo(Point other) {
        if (this.X == other.X) { return (int) (this.Y - other.Y); }
        return (int)(this.X - other.X);
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
