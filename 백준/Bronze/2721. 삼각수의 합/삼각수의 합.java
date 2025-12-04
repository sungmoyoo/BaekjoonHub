import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int[] dp = new int[n+2];

      int count = 1;
      dp[1] = count;
      for (int i = 2; i <= n+1; i++) {
        count++;
        dp[i] = dp[i-1] + count;
      }

      int sum = 0;
      for (int k = 1; k <= n; k++) {
        sum += k * dp[k+1];
      }

      bw.write(sum + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}