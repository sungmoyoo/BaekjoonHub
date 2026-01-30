import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int N = Integer.parseInt(br.readLine());
      int sum = 0;

      for (int i = 0; i < N; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < 3; j++) {
          int profit = Integer.parseInt(st.nextToken());
          max = Math.max(max, profit);
        }
        if (max > 0) {
          sum += max;
        }
      }
      bw.write(sum + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}