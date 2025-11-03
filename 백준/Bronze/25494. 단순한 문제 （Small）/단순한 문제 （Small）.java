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
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      int count = 0;

      for (int x = 1; x <= a; x++) {
        for (int y = 1; y <= b; y++) {
          for (int z = 1; z <= c; z++) {
            int r1 = x % y;
            int r2 = y % z;
            int r3 = z % x;

            if (r1 == r2 && r2 == r3) {
              count++;
            }
          }
        }
      }

      bw.write(count + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}