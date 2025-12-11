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

    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());
    int Y = Integer.parseInt(st.nextToken());

    int min = Integer.MAX_VALUE;
    for (int i = 0; i <=  Math.max(X, Y) * 2; i += 2) {
      int cost = 0;

      int half = i / 2;

      int remainX = Math.max(0, X - half);
      int remainY = Math.max(0, Y - half);

      cost = half * 2 * C + remainX * A + remainY * B;
      min = Math.min(min, cost);

    }

    bw.write(min + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}