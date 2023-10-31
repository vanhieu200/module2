package ss3_array;

import java.util.Scanner;

public class ThucHanhTimSinhvien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] studentName = {"one", "two", "three","four"};
        System.out.print("one, two, three, four");

        System.out.print("input name: ");
        String name = input.nextLine();
        boolean check = false;
        for (int i = 0; i < studentName.length; i++){
            if (studentName[i].equals(name)){
                check = true;
                System.out.println("student " + name + " at " + i);
                break;
            }else {
                System.out.print("not fount student " + name + " in array");
                break;
            }
        }


    }
}
