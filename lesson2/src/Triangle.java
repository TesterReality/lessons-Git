public class Triangle extends Figure {

    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
    }

    @Override
    public double getArea() {

        double a1 = a.getLength(b);
        double b1 = b.getLength(c);
        double c1 = c.getLength(a);
        System.out.println("Треугольник: а= " + a1 + " b= " + b1 + " c= " + c1);

        if (a1 + b1 <= c1 || a1 + c1 <= b1 || a1 + c1 <= b1)
            System.out.println("Такого треугольника не существует");
        else {
            double p = getPerimeter() / 2.0;
            return Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));
        }
        return -1;
    }

    @Override
    public double getPerimeter() {

        return a.getLength(b) + b.getLength(c) + c.getLength(a);
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

    @Override
    public String toString() {
        return "Triangle{" +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Периметр =" + getPerimeter() +
                ", Площадь =" + getArea() +
                '}';
    }
}


