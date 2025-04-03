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

    int N = Integer.parseInt(br.readLine());

    int[] row = new int[N + 1];
    int[] col = new int[N + 1];
    int[][] dp = new int[N + 1][N + 1];

    for (int i = 1; i <= N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      row[i] = Integer.parseInt(st.nextToken());
      col[i] = Integer.parseInt(st.nextToken());
    }

    for (int len = 2; len <= N; len++) {
      for (int i = 1; i + len - 1 <= N; i++) {
        int j = i + len - 1;
        dp[i][j] = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
          int cost = dp[i][k] + dp[k+1][j] + row[i] * col[k] * col[j];
          dp[i][j] = Math.min(dp[i][j], cost);
        }
      }
    }

    bw.write(dp[1][N] + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}