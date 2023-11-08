package ss4_Class_OOP.QuadraticEquation;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){}
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a = a;
    }
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b = b;
    }
    public double getC(){
        return c;
    }
    public void setC(double c){
        this.c = c;
    }

    public double getDiscrimimant(){
        return (this.b*2) - 4*(this.a*this.c);
    }
    public double getRoot1(){
        return ((-this.b) + Math.sqrt((this.b*2) - (4*this.a*this.c)))/(2*this.a);
    }
    public double getRoot2(){
        return ((-this.b) - Math.sqrt((this.b*2) - (4*this.a*this.c)))/(2*this.a);
    }
}
