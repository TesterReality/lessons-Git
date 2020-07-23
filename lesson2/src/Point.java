public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        super();
    }

    public double getLength(Point point) {
        double x = (this.getX() - point.getX()) * (this.getX() - point.getX());
        double y = (this.getY() - point.getY()) * (this.getY() - point.getY());
        return Math.sqrt(x + y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
