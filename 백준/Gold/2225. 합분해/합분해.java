import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static final int MOD = 1000000000;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[][] dp = new int[K+1][N+1];

    for (int i = 1; i <= K; i++) {
      dp[i][0] = 1;
    }

    for (int k = 1; k <= K; k++) {
      for (int n = 1; n <= N; n++) {
        dp[k][n] = (dp[k-1][n] + dp[k][n-1]) % MOD;
      }
    }

    bw.write(dp[K][N] + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}