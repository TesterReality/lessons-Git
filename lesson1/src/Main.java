public class Main {

    public static void main(String[] args) {

        Cat catOne = new Cat(5,5,false,"Рыба","Мурзик","Гавана");
        catOne.setAge(6);
        catOne.setWeigt(5.1);
        catOne.setRation("Молоко");

        System.out.println(catOne);

        Triangle triangleOne = new Triangle(8.6,4,5.5);
        System.out.println(triangleOne.getArea());
    }
}
