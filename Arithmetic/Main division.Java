// Using a try-catch block to input two integers in a divisional equation
import java.util.Scanner;
class Division {
    public static void main(String[] args) {
    int a, b, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
        a = input.nextInt();
        b = input.nextInt();
        // try block which blocks the code for a certain time.
        try {
          result = a / b;
          System.out.println("Result = " + result);
        }
        // catch block which catches the code in time
        catch(ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        }
    }
}
