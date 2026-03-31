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
    StringTokenizer st;

    int P = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < P; i++) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      int prev = 0;
      int cur = 1;
      int period = 0;

      while (true) {
        int temp = (prev + cur) % M;
        prev = cur;
        cur = temp;
        period++;

        if (prev == 0 && cur == 1) {
          break;
        }
      }
      bw.write(N + " " + period + "\n");
    }


    bw.flush();
    bw.close();
    br.close();
  }
}