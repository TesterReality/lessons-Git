public class Product implements IDelivery, ISelling, ISanitaryStation {

    private double price;
    private double size;
    private double weight;
    private String descriptions;
    private String address;
    private int expiryDate;

    public Product(double price, double size, double weight, String descriptions, String address, int expiryDate) {
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.descriptions = descriptions;
        this.address = address;
        this.expiryDate = expiryDate;
    }
    public Product() {
        super();
    }


    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return descriptions;
    }
    public void setDescription(String description) {
        this.descriptions = description;
    }

}
