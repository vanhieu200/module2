package ss3_array;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int[] array2;
        int number, add, index,count;
        count = 0;

        do {
            System.out.print("input element number: ");
            number = input.nextInt();
        }while(number <= 0);
//        mảng thứ nhất
        array = new int[number];

//        nhập phần tử cho mảng

        for (int i = 0; i < array.length; i++){
            System.out.print("\n element at " + i + " is: ");
            array[i] = input.nextInt();
            count++;
        }

//        xuất mảng
        System.out.print("\noutput array: ");
        for (int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


//        thêm phần tử vào mảng

        System.out.print("\ninput position want to add: ");
        index = input.nextInt();
        System.out.print("\ninput number want to add: ");
        add = input.nextInt();

//        tạo mảng mới
        array2 = new int[number+1];
//        copy mảng cũ qua mảng mới kiểm tra điều kiện và dịch chuyển phần ử tại vị trí muốn chèn sang phải
        for (int i = 0; i < number; i++){
            if(i < index){
                array2[i] = array[i];
            }else{
                array2[i+1] = array[i];
            }
        }
        array2[index] = add;
        array = array2;

        //        xuất mảng
        System.out.print("\n output array2 after add: ");
        for (int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
