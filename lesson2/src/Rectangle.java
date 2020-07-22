public class Rectangle extends Figure {

    private Point A;
    private Point B;
    private Point C;

    private  double length;
    private  double width;


    public Rectangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void calculate()
    {
        length = Math.sqrt((A.getX() - B.getX()) * (A.getX() - B.getX()) + (A.getY() - B.getY()) * (A.getY() - B.getY()));
        width = Math.sqrt((B.getX() - C.getX()) * (B.getX() - C.getX()) + (B.getY() - C.getY()) * (B.getY() - C.getY()));
        System.out.println("Прямоугольник: а= " +length + " b=" +width);
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
