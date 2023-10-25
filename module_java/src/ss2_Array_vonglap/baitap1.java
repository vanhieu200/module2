package ss2_Array_vonglap;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int number = scanner.nextInt();

        // in hình chữ nhật
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number+4; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

//        tam giác vuông góc dưới
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

//        in tam giác vuông ngược
        for (int i = 1; i <= number; i++){
            for (int j = number; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

//        tam giác cân
        for (int i = 0; i < number; i++){
            for (int j = 0; j <number-i; j++){
                System.out.print(" ");
            }
            for (int l = 0; l < i*2+1; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
