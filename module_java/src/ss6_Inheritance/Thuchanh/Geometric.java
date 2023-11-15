package ss6_Inheritance.Thuchanh;

public class Geometric {
//    trường dữ liệu
    private String color;
    private String filled;

//    khởi tạo phương thức không tham số và có tham số
    public Geometric(){}

    public Geometric(String color, String filled){
        this.color = color;
        this.filled = filled;
    }
//  khởi tạo getterr và setter
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getFilled(){
        return filled;
    }
    public void setFilled(String filled){
        this.filled = filled;
    }

    public String toString(){
        return "create with " + color + " color and " +
                ((filled == null)? "no fill" : " filled with " + filled + " color");
    }
}
