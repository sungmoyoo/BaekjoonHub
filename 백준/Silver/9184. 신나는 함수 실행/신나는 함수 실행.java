import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int maxN = 21;
  static long[][][] W = new long[maxN][maxN][maxN];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      if (a == -1 && b == -1 && c == -1) {
        break;
      }

      long result = w(a, b, c);
      bw.write("w(" + a + ", " + b + ", " + c + ") = " + result + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }

  static long w(int a, int b, int c) {
    if (a <= 0 || b <= 0 || c <= 0) {
      return 1;
    }

    if (a > 20 || b > 20 || c > 20) {
      return w(20, 20, 20);
    }

    if (W[a][b][c] != 0) {
      return W[a][b][c];
    }

    if (a < b && b < c) {
      W[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
    } else {
      W[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }

    return W[a][b][c];
  }
}