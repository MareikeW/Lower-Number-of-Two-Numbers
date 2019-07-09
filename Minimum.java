import java.util.Scanner;

/*Here you can enter 2 numbers and the program displays the lower number at the end.*/

public class Minimum {
        public static void main(String[] args) {
            Scanner num1 = new Scanner(System.in); //first number object
            System.out.print("Enter a number: ");
            int number1 = num1.nextInt();
            Scanner num2 = new Scanner(System.in);//second number object
            System.out.print("Enter a second number. ");
            int number2 = num2.nextInt();

//comparing the two entered numbers, which one is lower
            System.out.println(Math.min(number1, number2));
        }
}
