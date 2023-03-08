package Week2;
import java.util.Scanner;
//Primitive Data Types, Input and Operators
public class MainClassC{
    public static void main(String[] args) {
        //ill start at 1:40
        //Strings, int, float
        //char, double
        boolean bool = true;
        byte a = 10;
        short s = 100;
        int i = 10000;
        long l = 1000000L;
        float f = 232.32f;
        double d = 12.2;
        char c = 'C';
        Scanner scan = new Scanner(System.in);
//        System.out.print("Whats your name?");
//        String name = scan.nextLine();
//        System.out.printf("Your name is " + name);
        /** Make a program that asks to input number that represents temperature as farenheit and then convert
         that into celsius. **/
        System.out.print("Enter farenheit: ");
        float farenheit = scan.nextFloat();
        float celsius = (farenheit - 32) * 5/9;
        System.out.println(celsius);
    }
}
