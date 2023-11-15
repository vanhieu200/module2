package ss6_Inheritance.ThucHanh1;

public class main {
    public static void main(String[] args) {
//        lớp cha superclass
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);


//    lớp con subclass circle

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.4);
        System.out.println(circle);
        circle = new Circle(2.6, "yellow", false);
        System.out.println(circle);


        //    lớp con subclass rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 7.6);
        System.out.println(rectangle);
        rectangle = new Rectangle(1.4, 4.5, "blue",false);
        System.out.println(rectangle);

//        lớp con subclass square của rectangle
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(6.4, " black", false);
        System.out.println(square);
    }
}
