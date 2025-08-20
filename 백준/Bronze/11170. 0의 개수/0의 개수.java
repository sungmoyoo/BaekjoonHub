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
      int M = Integer.parseInt(st.nextToken());

      int count = 0;
      for (int i = N; i <= M; i++) {
        int num = i;
        if (num == 0) {
          count++;
        }
        while (num > 0) {
          if (num % 10 == 0) count++;
          num /= 10;
        }
      }
      bw.write(count + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}