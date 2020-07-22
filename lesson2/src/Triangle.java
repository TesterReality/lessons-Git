public class Triangle extends Figure {

    private Point A;
    private Point B;
    private Point C;
    private double a;
    private double b;
    private double c;
    private double p;//полупериметр
    private double S;//площадь

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void calculate() {
        a = Math.sqrt((A.getX() - B.getX()) * (A.getX() - B.getX()) + (A.getY() - B.getY()) * (A.getY() - B.getY()));
        b = Math.sqrt((A.getX() - C.getX()) * (A.getX() - C.getX()) + (A.getY() - C.getY()) * (A.getY() - C.getY()));
        c = Math.sqrt((B.getX() - C.getX()) * (B.getX() - C.getX()) + (B.getY() - C.getY()) * (B.getY() - C.getY()));
        System.out.println("Треугольник: а= " +a + " b= " +b + " c= " +c);

        if (a + b <= c || a + c <= b || a + c <= b)
            System.out.println("Такого треугольника не существует");
        else {
            p = (a + b + c) / 2.0;
            S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    @Override
    public double getPerimeter() {
        return p*2;
    }

    @Override
    public double getArea() {
        return S;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", p=" + p +
                ", S=" + S +
                '}';
    }
}


