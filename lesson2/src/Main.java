public class Main {
    public static void main(String[] args) {

        Point A = new Point(8, 7);
        Point B = new Point(10, 5);
        Point C = new Point(5, 6);
        Point D = new Point(10, 6);

        Triangle triangleOne = new Triangle(A, B, C);
        System.out.println("Площадь треугольника: " + triangleOne.getArea());
        System.out.println("Периметр треугольника: " + triangleOne.getPerimeter());
        System.out.println(triangleOne);

        Rectangle rectangleOne = new Rectangle(A, B, C,D);
        System.out.println("Вычисление данных прямоугольника");
        System.out.println("Площадь прямоугольника: " + rectangleOne.getArea());
        System.out.println("Периметр прямоугольника: " + rectangleOne.getPerimeter());
        System.out.println(rectangleOne);

        Scene sceneOne = new Scene();
        sceneOne.add(triangleOne,0);
        sceneOne.add(rectangleOne,2);
        sceneOne.deleteByIndex(1);
        System.out.println(sceneOne);
    }
}
