final class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public final double getArea() {
        return length * breadth;
    }
}

public class lab4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("The area of the rectangle is " + rectangle.getArea());
    }
}