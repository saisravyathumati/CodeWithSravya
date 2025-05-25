import java.util.*;
public class IterativeRecursion {

  public static void main(String[] args) {
    System.out.println("Finding the factorial of a number using recursive approach");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(IterativeRecursion.factorial(n));
  }
  
  public static int factorial(int n) {
      int fact = 1;
      while(n!= 0) {
        fact = fact * n;
        n--;
      }
    return fact;
  }
  
}
