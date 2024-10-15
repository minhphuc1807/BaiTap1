package Ex_Classes.Bai_1_3;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2);

        rectangle1.setLength(5.6f);
        rectangle1.setWidth(7.8f);
        System.out.println(rectangle1);
        System.out.println("Length is: " + rectangle1.getLength());
        System.out.println("Width is " + rectangle1.getWidth());

        System.out.printf("Area is: %.2f%n", rectangle1.getArea() );
        System.out.printf("Circumference is: %.2f%n", rectangle1.getCircumference() );
    }
}
