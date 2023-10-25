package ss2_Array_vonglap;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number prime to show: ");
        int number = scanner.nextInt();

        int count = 0;
        int n = 2;

        while(count < number){
            boolean check = true;
            for(int i = 2; i < n; i++){
                if (n % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
