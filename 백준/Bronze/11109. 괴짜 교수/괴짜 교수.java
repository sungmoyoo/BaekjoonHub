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
      StringTokenizer st = new StringTokenizer(br.readLine());
      int d = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());
      int s = Integer.parseInt(st.nextToken());
      int p = Integer.parseInt(st.nextToken());

      if (d + p * n > s * n) {
        bw.write("do not parallelize\n");
      } else if (d + p * n < s * n) {
        bw.write("parallelize\n");
      } else {
        bw.write("does not matter\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}