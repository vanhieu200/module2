package baitap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "", result1 = "", result2 = "", temp = "";
//        nhập số
        System.out.print("input number:");
        int number = scanner.nextInt();
//        tính toán
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;


        if (hundreds >= 0 && hundreds < 10) {
            switch (hundreds) {
                case 1:
                    result = "one hundreds";
                    break;
                case 2:
                    result = "two hundreds";
                    break;
                case 3:
                    result = "three hundreds";
                    break;
                case 4:
                    result = "four hundreds";
                    break;
                case 5:
                    result = "five hundreds";
                    break;
                case 6:
                    result = "six hundreds";
                    break;
                case 7:
                    result = "seven hundreds";
                    break;
                case 8:
                    result = "eight hundreds";
                    break;
                case 9:
                    result = "nine hundreds";
                    break;
            }
        }

        if (tens >= 1 && tens < 10) {
            switch (tens) {
                case 1:
                    result1 = "ten";
                    break;
                case 2:
                    result1 = "twenty";
                    break;
                case 3:
                    result1 = "thirteen";
                    break;
                case 4:
                    result1 = "fourteen";
                    break;
                case 5:
                    result1 = "fifteen";
                    break;
                case 6:
                    result1 = "sixteen";
                    break;
                case 7:
                    result1 = "seventeen";
                    break;
                case 8:
                    result1 = "eighteen";
                    break;
                case 9:
                    result1 = "nineteen";
                    break;
            }
        }
        if (ones >= 1 && ones < 10) {
            switch (ones) {
                case 0:
                    result2 = "zero";
                    break;
                case 1:
                    result2 = "one";
                    break;
                case 2:
                    result2 = "two";
                    break;
                case 3:
                    result2 = "three";
                    break;
                case 4:
                    result2 = "four";
                    break;
                case 5:
                    result2 = "five";
                    break;
                case 6:
                    result2 = "six";
                    break;
                case 7:
                    result2 = "seven";
                    break;
                case 8:
                    result2 = "eight";
                    break;
                case 9:
                    result2 = "nine";
                    break;
            }
        }

        System.out.println(number + " sau khi chuyển sang từ là: " + result + " " + (result1) + " " + result2);
    }
}