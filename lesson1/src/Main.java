public class Main {

    public static void main(String[] args) {

        Cat catOne = new Cat(5,5,false,"Рыба","Мурзик","Гавана");
        catOne.setAge(6);
        catOne.setWeigt(5.1);
        catOne.setRation("Молоко");

        System.out.println(catOne);

        Triangle triangleOne = new Triangle(8.6,4,5.5);
        System.out.println(triangleOne.getArea());

        Network networkPrometeus = new Network("Прометей");
        Network networkMTS = new Network("МТС");

        Phone phoneOne = new Phone("8800555555");
        Phone phoneTwo = new Phone("8800555555");
        Phone phoneThree = new Phone("8800777777");

        phoneOne.registrationNetwork(networkPrometeus);
        phoneTwo.registrationNetwork(networkPrometeus);
        phoneThree.registrationNetwork(networkPrometeus);

        phoneOne.call("8800777777");
        phoneOne.call("8-32-44");

        phoneOne.registrationNetwork(networkMTS);
        phoneOne.call("8800777777");

    }
}
