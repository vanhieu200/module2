package ss3_array;

import java.util.Scanner;

public class MaxArray2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;

        int[][] array;
        System.out.print("input row: ");
        row = input.nextInt();
        System.out.print("\n input col: ");
        col = input.nextInt();
//khởi tạo mảng hai chiều
        array = new int[row][col];
//nhập giá trị cho mảng
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print("\n element row " + i + " col " + j + " is: ");
                array[i][j] = input.nextInt();
            }
        }
//xuất mảng hai chiều
        System.out.println("ouput array: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
//    tìm max trong mảng 2 chiều
        int max = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
               if (array[i][j] > max){
                   max = array[i][j];
               }
            }
        }
//       max
        System.out.print("\n max on array: " + max );
    }
}
