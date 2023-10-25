package ss2_Array_vonglap;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {

       for (int i = 2; i < 100; i++){
           boolean check = true;
           for (int j = 2; j < i; j++){
               if (i % j == 0){
                   check = false;
                   break;
               }
           }
           if (check){
               System.out.println(i + " ");
           }
       }


    }
}
