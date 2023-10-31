package ss3_array;

import java.util.Scanner;

public class BaiThucHanh1 {
    public static void main(String[] args) {
       int size;
       int[] array;
        Scanner input = new Scanner(System.in);
        System.out.print("input size: ");
        size = input.nextInt();

        array = new int[size];
//        nhập phần tử vào mảng
        for (int i = 0; i < array.length; i++){
            System.out.print("element " + i + " is: ");
            array[i] = input.nextInt();
        }

//        xuất mảng
        System.out.print("output array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

//        đảo ngược mảng
        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }

//        xuất mảng sau đảo ngược
        System.out.print("\narray reverce: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
