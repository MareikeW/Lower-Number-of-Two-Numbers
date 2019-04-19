//Here you can enter 2 numbers and the program displays the lower number at the end.
package Minimum;

import java.util.Scanner;

public class Minimum {
        public static void main(String[] args) {
            Scanner num1 = new Scanner(System.in); //first number object
            System.out.print("Enter a number: ");
            int number1 = num1.nextInt();
            Scanner num2 = new Scanner(System.in);//second number object
            System.out.print("Enter a second number. ");
            int number2 = num2.nextInt();

//comparing the two numbers, which one is lower
            if (number1 < number2)
                System.out.println("The minimum of both numbers is: " + number1);//number1 is the minimum
            else 
                System.out.print("The minimum of both numbers is: " + number2); //number2 is the minimum
        }
}
