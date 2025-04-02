import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int t = 0; t < T; t++) {
      int N = Integer.parseInt(br.readLine());
      int[] sum = new int[N+1];
      int[][] dp = new int[N+1][N+1];

      StringTokenizer st = new StringTokenizer(br.readLine());

      for (int i = 1; i <= N; i++) {
        int file = Integer.parseInt(st.nextToken());
        sum[i] = sum[i-1] + file;
      }

      for (int len = 2; len <= N; len++) {
        for (int i = 1;  i + len - 1 <= N; i++) {
          int j = i + len - 1;
          dp[i][j] = Integer.MAX_VALUE;

          for (int k = i; k < j; k++) {
            int cost = dp[i][k] + dp[k+1][j] + (sum[j] - sum[i-1]);
            dp[i][j] = Math.min(dp[i][j], cost);
          }
        }
      }
      bw.write(dp[1][N] + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}