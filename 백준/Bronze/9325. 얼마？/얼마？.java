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
      int s = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int option = 0;

      while (n-- > 0) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        option += q * p;
      }

      bw.write(s + option + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}