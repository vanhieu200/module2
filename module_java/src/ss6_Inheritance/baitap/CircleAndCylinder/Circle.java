package ss6_Inheritance.baitap.CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;
//    phương thức có và không có tham số
    public Circle(){
        radius = 4.5;
        color = "blue";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
//    khởi tạo getter và setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//    diện tích
    public double getArea(){
        return (this.radius*this.radius)*Math.PI;
    }
//    chu ví
    public double getPerimeter(){
        return (this.radius*2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle has radius = " + getRadius() + " which is color: " + getColor();
    }
}
