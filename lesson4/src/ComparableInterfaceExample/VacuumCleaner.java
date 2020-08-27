package ComparableInterfaceExample;

public class VacuumCleaner implements Comparable {
    private int size;
    private String brand;
    private String type;

    public VacuumCleaner(int size, String brand, String type) {
        this.size = size;
        this.brand = brand;
        this.type = type;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return -1;
        }
        VacuumCleaner anotherVacuumCleaner = (VacuumCleaner) o;

        if (this.size > anotherVacuumCleaner.getSize()) {
            return 1;
        }
        if (this.size < anotherVacuumCleaner.getSize()) {
            return -1;
        }
        return 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
