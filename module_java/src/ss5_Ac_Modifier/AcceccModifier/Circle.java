package ss5_Ac_Modifier.AcceccModifier;

public class Circle {
    private double radius = 1.0;
    private  String color = "red";

    public void AcceccModifier(){}

    public void AcceccModifier(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void display(){
        System.out.println(color + " " + radius + " area: " + getArea() );
    }
}
