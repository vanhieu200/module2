package ss5_Ac_Modifier.ClassWriteOnly;

import java.util.Scanner;
import ss5_Ac_Modifier.ClassWriteOnly.Student.*;

public class test {
    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("before: " + student.getName());
        System.out.println("before: " + student.getClasses());

        student.setName("hiếu");
        student.setClasses("C0723i1");

        System.out.println("after " + student.getName());
        System.out.println("after " + student.getClasses());


    }
}
