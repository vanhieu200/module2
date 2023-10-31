package ss3_array;

import java.util.Scanner;

public class thuchanhCtoF {
    public static double CelsiusToFahrenheit(double Celsius){
        double Fahrenheit = (9.0/5) * Celsius + 32;
        return Fahrenheit;
    }
    public static double FahrenheitToCelsius(double Fahrenheit){
        double Celsius = (5.0 / 9) * (Fahrenheit - 32);
        return Celsius;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input number 1 to 3: " +
                        "\n1. Celsius To Fahrenheit" +
                        "\n2. Fahrenheit to Celsius" +
                        "\n3. Exit");
        System.out.print("\n input number: ");
        int choose = input.nextInt();
        double c,f,result;

        while( 0 >= choose || choose <= 3){
            if (choose == 1){
                System.out.print("\n input Celsius: ");
                c = input.nextDouble();
                result = CelsiusToFahrenheit(c);
                System.out.print("\n Celsius to Fahrenheit: " + result);

            }else if(choose == 2){
                System.out.print("\n input Fahrenheit: ");
                f = input.nextDouble();
                result = FahrenheitToCelsius(f);
                System.out.print("\n Fahrenheit to Celsius: " + result);
            }else{
                break;
            }
        }

    }
}
