public class Rectangle extends Figure {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle() {
        super();
    }

    @Override
    public double getPerimeter() {
        return a.getLength(b) + b.getLength(c) + c.getLength(d) + d.getLength(a);
    }

    @Override
    public double getArea() {
        Triangle triangleOne = new Triangle(a, b, c);
        Triangle triangleTwo = new Triangle(a, d, c);
        return triangleOne.getArea() + triangleTwo.getArea();
    }


    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a =" + a +
                ", b =" + b +
                ", c =" + c +
                ", d =" + d +
                ", Периметр =" + getPerimeter() +
                ", Площадь =" + getArea() +
                '}';
    }
}
