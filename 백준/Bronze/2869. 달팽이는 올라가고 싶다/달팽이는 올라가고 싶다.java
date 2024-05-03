import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int V = sc.nextInt();
    int C;
    
    if ((V-A) % (A-B) == 0) {
      C = (V-A)/(A-B)+1;
    } else {
      C = (V-A)/(A-B)+2;
    }



    System.out.println(C);
  }
}