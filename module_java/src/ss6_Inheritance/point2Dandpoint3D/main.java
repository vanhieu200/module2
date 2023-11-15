package ss6_Inheritance.point2Dandpoint3D;

public class main {
    public static void main(String[] args) {
        System.out.println("point 2d");
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3.2f,5);
        System.out.println(point2D);

        System.out.println("\npoint 3d");
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(1.0f);
        System.out.println(point3D);
        point3D = new Point3D(3, 5.4f, 2.7f);
        System.out.println(point3D);
    }
}
