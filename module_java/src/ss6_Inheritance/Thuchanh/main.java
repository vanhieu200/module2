package ss6_Inheritance.Thuchanh;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        circle.setFilled("black");
        System.out.println("radius circle: " + circle.getRadius());
        System.out.println("Area circle: " + circle.getArea());
        System.out.println("Primeter circle: " + circle.getPerimeter());
        System.out.println("Diameter circle: " + circle.getDiameter());
        System.out.println("toString : " + circle.toString());
        System.out.println();

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(" Area Ractangle : " + rectangle.getArea());
        System.out.println(" Perimeter Ractangle : " + rectangle.getPerimeter());
        System.out.println(" toString Ractangle : " + rectangle.getPerimeter());

    }
}
