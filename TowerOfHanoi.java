import java.util.*;
public class TowerOfHanoi {

  public static void main(String[] args) {
    char fromm = 'a', to = 'b', aux = 'c';
    System.out.println("Tower of Hanoi recursive approach");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(TowerOfHanoi.towerOfHanoi(n, fromm, to, aux));
  }
  
  public static int towerOfHanoi(int n, char fromm, char to, char aux) {
      if(n == 1 || n == 0)
      return n;
      return 1 + TowerOfHanoi.towerOfHanoi(n-1, fromm, aux, to) + TowerOfHanoi.towerOfHanoi(n-1, aux, to, fromm);
      // Move n-1 disks from source to auxiliary ---> operation 1
      // Move n-1 disks from auxiliary to destination ---> operation 2
  }
  
}
