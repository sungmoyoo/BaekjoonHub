import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] T = new int[44];

    for (int i = 1; i <= 44; i++) {
      T[i - 1] = i * (i + 1) / 2;
    }
    int testcase = Integer.parseInt(br.readLine());

    while (testcase-- > 0) {
      int N = Integer.parseInt(br.readLine());
      boolean eureka = false;

      for (int i : T) {
        for (int j : T) {
          for (int k : T) {
            if (i + j + k == N) {
              eureka = true;
              break;
            }
          }
        }
      }

      if (eureka) {
        bw.write("1\n");
      } else {
        bw.write("0\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}