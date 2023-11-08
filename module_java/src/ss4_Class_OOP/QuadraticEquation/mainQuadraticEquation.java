package ss4_Class_OOP.QuadraticEquation;

import java.util.Scanner;

public class mainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input elemenet for pt bậc 2");
        double a = checkA();
        System.out.print("\n input b: ");
        double b = scanner.nextDouble();
        System.out.print("\n input c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscrimimant() < 0){
            System.out.println(" vô nghiệm");
        } else if (quadraticEquation.getDiscrimimant() > 0) {
            System.out.print("\n nghiệm 1: " + quadraticEquation.getRoot1());
            System.out.print("\n nghiệm 2: " + quadraticEquation.getRoot2());
        }else{
            System.out.print(" có 1 nghiệm phân biệt: " + quadraticEquation.getRoot2());
        }
    }
    public static double checkA(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" input a: ");
        double a = Double.parseDouble(scanner.nextLine());
        while(true){
            if(a != 0){
                return a;
            }else{
                System.out.print("vui lòng nhập lại a: ");
                a = Double.parseDouble(scanner.nextLine());
            }
        }
    }
}
