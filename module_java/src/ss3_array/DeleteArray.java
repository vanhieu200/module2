package ss3_array;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number,delete;
       int[] array;
       int index;
//kiểm tra nhập số phần tử lớn hơn 0
        do {
            System.out.printf("input element number: ");
            number = input.nextInt();
        }while(number <= 0);
//khởi tạo size cho mảng
        array = new int[number];
//        nhập phần tử cho mảng
        for (int i = 0; i < array.length; i++){
            System.out.printf("\nelement at " + i + " is: ");
            array[i] = input.nextInt();
        }
//      xuất mảng
        System.out.printf("\n output array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

//        xóa phần tử trong mảng
        boolean check = false;
        System.out.print("\n input position want to delete: ");
        delete = input.nextInt();

        for (int i = 0; i < array.length; i++){
            if (delete == array[i]){
                check = true;
                index = i;
                for (int j = index; j < array.length-1; j++){
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
            }
        }

        if(!check){
            System.out.println("not fount " + delete + " in array");

        }else{
            System.out.print("\n mảng sau khi xóa: ");
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
        }


    }
}
