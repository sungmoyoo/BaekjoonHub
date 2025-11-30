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

    int K = Integer.parseInt(br.readLine());

    while (K-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int P = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      int[] seats = new int[M+1];
      for (int i = 0; i < P; i++) {
        int m = Integer.parseInt(br.readLine());
        seats[m]++;
      }

      int count = 0;
      for (int n : seats) {
        if (n > 1) {
          count += n - 1;
        }
      }

      bw.write(count + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}