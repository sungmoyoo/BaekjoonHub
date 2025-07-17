import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int A = 100;
    int B = 100;

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if (a > b) {
        B -= a;
      } else if (a < b) {
        A -= b;
      }
    }

    bw.write(A + "\n");
    bw.write(B + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}