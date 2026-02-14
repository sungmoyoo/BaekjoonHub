import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      long B = Long.parseLong(st.nextToken());
      long N = Long.parseLong(st.nextToken());

      if (B == 0 && N == 0) {
        break;
      }

      int A = 1;
      while (true) {
        long currentPow = (long) Math.pow(A, N);
        long nextPow = (long) Math.pow(A + 1, N);

        if (Math.abs(currentPow - B) <= Math.abs(nextPow - B)) {
          bw.write(A + "\n");
          break;
        }

        A++;
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}