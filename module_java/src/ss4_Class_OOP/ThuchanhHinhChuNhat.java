package ss4_Class_OOP;

public class ThuchanhHinhChuNhat {
    double width, height;
    public ThuchanhHinhChuNhat(){}

    public ThuchanhHinhChuNhat(double width , double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimater(){
        return (this.height + this.width) * 2;
    }

    public String display(){
        return "ThuchanhHinhChuNhat{"+ " width " + width + ", height " + height + "}";
    }
}
