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

    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int r = Integer.parseInt(st.nextToken());
    int g = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    for (int i = 1; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int currentR = Integer.parseInt(st.nextToken());
      int currentG = Integer.parseInt(st.nextToken());
      int currentB = Integer.parseInt(st.nextToken());

      int newR = Math.min(g, b) + currentR;
      int newG = Math.min(r, b) + currentG;
      int newB = Math.min(r, g) + currentB;

      r = newR;
      g = newG;
      b = newB;
    }

    bw.write(Math.min(r, Math.min(g, b)) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}