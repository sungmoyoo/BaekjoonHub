import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 2 * N; j++) {
        if (j <= i || j >= 2 * N -1 - i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    for (int i = N - 1; i > 0; i--) {
      for (int j = 2 * N; j > 0; j--) {
        if (j <= i || j >= 2 * N - i + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    bw.flush();
    br.close();
    bw.close();
  }
}
