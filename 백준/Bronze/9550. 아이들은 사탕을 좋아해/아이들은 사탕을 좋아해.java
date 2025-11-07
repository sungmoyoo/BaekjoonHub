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

    while (T-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
      int result = 0;

      for (int i = 0; i < N; i++) {
        if (!st.hasMoreTokens()) {
          st = new StringTokenizer(br.readLine());
        }
        result += Integer.parseInt(st.nextToken()) / K;
      }


      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}