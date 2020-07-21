public class Triangle {

    private double a;
    private double b;
    private double c;
    private double p;//полупериметр
    private  double S;//площадь

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea()
    {
        p=(a+b+c)/2;
        S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
}
