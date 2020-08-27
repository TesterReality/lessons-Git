public class Main {

    public static void main(String[] args) {

        Product buckwheat = new Product(30,2,50,"Гречская Гречка","Село",2021);
        Manager m = new Manager("Вова",28,"Новичок");

        m.raisePrice(buckwheat,5);

        System.out.println(buckwheat.getPrice());

        DeliveryMan dman = new DeliveryMan("Эдуард",20);

        dman.delivered(buckwheat);

        SanStation s = new SanStation("Русская Еда");

        s.cehck(buckwheat);

    }
}
