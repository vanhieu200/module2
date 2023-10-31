package ss3_array;

import java.util.Scanner;

public class GopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        int[] arr3;
        int number1,number2, number3;


//        nhập số lượng phần tử cho mảng 1
        System.out.print("input element number for arr one: ");
        number1 = input.nextInt();
        arr1 = new int[number1];

//        nhập phần tử cho mảng 1
        for (int i = 0; i < arr1.length; i++){
            System.out.print("\n elemetn at " + i + " is: ");
            arr1[i] = input.nextInt();
        }

        //        nhập số lượng phần tử cho mảng 2
        System.out.print("\ninput element number for arr two: ");
        number2 = input.nextInt();
        arr2 = new int[number2];

//        nhập phần tử cho mảng 2
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("\n elemetn at " + i + " is: ");
            arr2[i] = input.nextInt();
        }

// xuát mảng 1
        System.out.print("\n output array 1: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
// xuát mảng 2
        System.out.print("\n output array 2: ");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

//        mảng 3
        number3 = number1 + number2;
        arr3 = new int[number3];
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }

       for (int j = 0; j < arr2.length; j++){
           arr3[arr1.length+j] = arr2[j];
       }

        System.out.print("\n arr 3: ");
        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }

}
