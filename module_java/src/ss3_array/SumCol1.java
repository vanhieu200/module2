package ss3_array;

import java.util.Scanner;

public class SumCol1 {
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
// nhập cột muốn tính tổng
        int ColSum,sum = 0;
        do {
            System.out.print("\n yoo want to sum col (0 at " + (col-1) + " ) :");
            ColSum = input.nextInt();
        }while(ColSum > col-1);

        for (int i = 0 ; i < array.length; i++){
           sum  += array[i][ColSum];
        }

        System.out.print("\n sum of col " + ColSum + " is " + sum);

    }
}
