package ss3_array;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        char chr;
        int count = 0;

        str = "phan van hieu";
        System.out.println("String: " + str);

        chr = 'n';
//        chuyển thành kí tự rồi đếm
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == chr){
                count++;
            }
        }

        System.out.print("character " + chr + " exist: " + count );
    }
}