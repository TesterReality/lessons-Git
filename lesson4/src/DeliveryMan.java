public class DeliveryMan {

    private String name;
    private int age;

    public DeliveryMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void delivered(IDelivery d)
    {
        System.out.println("Идет доставка товара по адресу: " + d.getAddress());
    }
}
