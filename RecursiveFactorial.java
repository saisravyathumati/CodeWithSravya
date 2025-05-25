import java.util.*;
public class RecursiveFactorial {

  public static void main(String[] args) {
    System.out.println("Finding the factorial of a number using recursive approach");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(RecursiveFactorial.factorial(n));
  }
  
  public static int factorial(int n) {
      if(n == 1 || n == 0) {
          return 1;
      }
      return n * RecursiveFactorial.factorial(n-1);
  }
  
}
