package ss6_Inheritance.baitap.CircleAndCylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        height = 8.7;
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        this.height = height;
        setRadius(radius);
        setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //    thể tích hinh tru
    public double getVolume(){
        return Math.PI * this.height * (this.getRadius()*this.getRadius());
    }

    @Override
    public String toString() {
        return "cylinder has height = " + getHeight() + " which is a subclass " + super.toString();
    }
}
