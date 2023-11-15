package ss6_Inheritance.pointAndMoveablePoint;

public class main {
    public static void main(String[] args) {
        System.out.println("point \n");
        Point point = new Point();
        System.out.println(point);
        point = new Point(2.3f, 5);
        System.out.println(point);

        System.out.println("\n movePoint");
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2, 4.5f);
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2,4, 5.4f, 4.5f);
        System.out.println(moveablePoint);
    }
}
