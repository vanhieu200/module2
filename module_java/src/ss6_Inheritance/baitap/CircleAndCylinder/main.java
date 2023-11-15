package ss6_Inheritance.baitap.CircleAndCylinder;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(8.7, " red");
        System.out.println(circle);

        System.out.println("\ncylinder");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(8.5);
        System.out.println(cylinder);
        cylinder = new Cylinder(6.4,4.3,"green");
        System.out.println(cylinder);
    }
}
