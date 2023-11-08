package ss4_Class_OOP;

import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("input width: ");
        double width = input.nextDouble();
        System.out.print("\ninput height: ");
        double height = input.nextDouble();
        ThuchanhHinhChuNhat hinhChuNhat = new ThuchanhHinhChuNhat(width, height);
        System.out.print("\n rectangle display: \n" + hinhChuNhat.display());
        System.out.print("\n getArea: " + hinhChuNhat.getArea());
        System.out.print("\n getPerimater: " + hinhChuNhat.getPerimater());

    }

}
