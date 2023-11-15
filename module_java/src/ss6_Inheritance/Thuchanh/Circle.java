package ss6_Inheritance.Thuchanh;

public class Circle extends Geometric {
    private double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, String filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
//S = pi*r*r
    public double getArea(){
        return (this.radius * this.radius) * Math.PI;
    }
//    đường kính
    public double getDiameter(){
        return this.radius * 2;
    }
//    chu vi C = r * 2 * pi
//            C  = d * pi (d đường kính)
    public double getPerimeter(){
        return getDiameter() * Math.PI;
    }

    public void printCircle(){
        System.out.println("Area circle: " + getArea() +
                "\nDiameter circle: " + getDiameter() +
                "\nPerimeter circle: " + getPerimeter());
    }
}
