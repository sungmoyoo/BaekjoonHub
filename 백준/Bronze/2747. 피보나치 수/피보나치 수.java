import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int maxN = 46;
  static Long[] dp = new Long[maxN];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    dp[0] = 0L;
    dp[1] = 1L;

    for (int i = 2; i < maxN; i++) {
      dp[i] = dp[i-1] + dp[i-2];
    }

    int n = Integer.parseInt(br.readLine());

    bw.write(dp[n] + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
