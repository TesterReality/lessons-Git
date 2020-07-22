public class Main {
    public static void main(String[] args) {

        Point A = new Point(8, 7);
        Point B = new Point(10, 5);
        Point C = new Point(5, 6);

        Point D = new Point(10, 6);
        Point E = new Point(15, 6);
        Point F = new Point(15, 3);


        Triangle triangleOne = new Triangle(A, B, C);
        triangleOne.calculate();
        System.out.println("Площадь треугольника: " + triangleOne.getArea());
        System.out.println("Периметр треугольника: " + triangleOne.getPerimeter());
        System.out.println(triangleOne);

        Rectangle rectangleOne = new Rectangle(D, E, F);
        rectangleOne.calculate();
        System.out.println("Площадь прямоугольника: " + rectangleOne.getArea());
        System.out.println("Периметр прямоугольника: " + rectangleOne.getPerimeter());
        System.out.println(rectangleOne);
    }
}
