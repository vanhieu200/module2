package baitap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        double USD,tigia1,VND,result;
        tigia1 = 23000;

            System.out.println("chuyển đổi tiền USD sang VNĐ");
            System.out.print("input USD: ");
            USD = scanner.nextDouble();
            result = USD * tigia1;
            System.out.println("số tiền nhận được là :" + result + " vnđ");



    }
}
