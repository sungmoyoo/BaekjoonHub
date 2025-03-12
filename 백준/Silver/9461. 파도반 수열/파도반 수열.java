import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int maxN = 100;
  static long[] dp = new long[maxN+1];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long[] k = {1, 1, 1, 2, 2, 3, 4, 5, 7, 9};
    System.arraycopy(k, 0, dp, 1, k.length);

    for (int i = 11; i <= 100; i++) {
      dp[i] = dp[i-1] + dp[i-5];
    }

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int N = Integer.parseInt(br.readLine());

      bw.write(dp[N] + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}