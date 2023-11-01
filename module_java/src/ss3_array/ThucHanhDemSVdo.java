package ss3_array;

import java.util.Scanner;

public class ThucHanhDemSVdo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int number;

        do {
            System.out.print("input element number for array: ");
            number = input.nextInt();
            if (number > 30){
                System.out.println("size <= 30");
            }
        }while(number > 30);
        array = new int[number];
//        nhập giá trị cho mảng
        for (int i = 0; i < array.length; i++){
            System.out.print("\n element at " + i + " is: ");
            array[i] = input.nextInt();
        }
//        kiểm tra bao nhiêu SV đậu
        int count = 0;
        System.out.print("\n array output: ");
        for (int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
            if (array[i] >= 5 && array[i] <= 10){
                count++;
            }
        }

        System.out.print("\n number of student pass the exam is " + count);

    }
}
