import java.util.Scanner;
class SwapNumbers {
   public static void main(String args[]) {
      // Finding the x and y axis
      int x, y, temp;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
      // Next integer to find x and y
      x = in.nextInt();
      y = in.nextInt();
      System.out.println("Before swapping\nx = "+x+"\ny = "+y);
      x = x + y;
      y = x - y;
      x = x - y;
      System.out.println("After swapping\nx "+x+"\ny = "+y);
  }
}
