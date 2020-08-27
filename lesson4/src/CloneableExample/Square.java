package CloneableExample;

public class Square implements Cloneable {

    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public Square clone() {
        try {
            return (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
