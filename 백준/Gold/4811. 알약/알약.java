import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    BigInteger[] dp = new BigInteger[31];
    dp[0] = BigInteger.ONE;

    for (int n = 1; n <= 30; n++) {
      dp[n] = BigInteger.ZERO;
      for (int i = 0; i < n; i++) {
        dp[n] = dp[n].add(dp[i].multiply(dp[n - 1 - i]));
      }
    }

    String line;
    StringBuilder sb = new StringBuilder();
    while (!(line = br.readLine()).equals("0")) {
      int N = Integer.parseInt(line);
      sb.append(dp[N]).append("\n");
    }

    bw.write(sb + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}