package ss3_array;

import java.util.Scanner;

public class SumDuongCheoMaTrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int row,col;
        System.out.print("input element number row: ");
        row = input.nextInt();
        System.out.print("input element number col: ");
        col = input.nextInt();

        array = new int[row][col];
//        thêm phần tử cho mảng
        for (int i = 0; i < array.length;i++){
            for (int j = 0 ; j < array[i].length;j++){
                System.out.print("element at row " + i + " col " + j + " is: " );
                array[i][j] = input.nextInt();
            }
        }
//        xuất mảng
        for (int i = 0; i < array.length; i++){
            for (int j = 0 ; j < array[i].length;j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
// tính tổng đường chéo của ma trận
        int sum = 0;

        for (int i = 0 ; i < array.length; i++){
            for (int j = i; j < array[i].length; j++){
                sum += array[i][j];
                break;
            }
        }

        System.out.print("\n tổng của đường chéo" + sum);

    }
}
