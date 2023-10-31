package ss3_array;

import java.util.Scanner;

public class ThucHanhMax {
    public static void main(String[] args) {
        int size, max;
        int[] array;

        Scanner  input = new Scanner(System.in);
        System.out.print("input element number: ");
        size = input.nextInt();

        array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.print("element " + i + " is: ");
            array[i] = input.nextInt();
        }
        max = array[0];

        System.out.print("\noutput array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.print("\n max");
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.print("max in array: " + max);
    }
}
