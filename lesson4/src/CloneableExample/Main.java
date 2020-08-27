package CloneableExample;

public class Main {
    public static void main(String[] args) {

        Square s1 = new Square(50);
        Square s2 = new Square(100);

        Square s3 = s1.clone();

        s1.setSide(150);

        System.out.println(s1.getSide());
        System.out.println(s2.getSide());
        System.out.println(s3.getSide());
    }
}
