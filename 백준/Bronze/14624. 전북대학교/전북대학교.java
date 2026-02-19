import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    if (N % 2 == 0) {
      System.out.println("I LOVE CBNU");
    } else {
      for (int i = 0; i < N; i++) {
        System.out.print("*");
      }
      System.out.println();

      int mid = N / 2;

      for (int i = 0; i < mid; i++) {
        System.out.print(" ");
      }
      System.out.println("*");

      for (int i = 0; i < mid; i++) {
        for (int j = 0; j < mid - i - 1; j++) {
          System.out.print(" ");
        }
        System.out.print("*");

        for (int j = 0; j < i * 2 + 1; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
    }

    br.close();
  }
}