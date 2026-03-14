import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    if (N <= 10000) {
      System.out.println("Accepted");
    } else {
      System.out.println("Time limit exceeded");
    }
  }
}