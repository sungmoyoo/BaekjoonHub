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
      int N = Integer.parseInt(br.readLine());

      int sum = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < N; i++) {
        sum += Integer.parseInt(st.nextToken());
      }

      bw.write(sum + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}