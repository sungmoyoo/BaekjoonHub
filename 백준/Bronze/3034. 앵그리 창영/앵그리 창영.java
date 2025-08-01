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
    int N = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());

    int a = (int) Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

    while (N-- > 0) {
      int match = Integer.parseInt(br.readLine());
      if (match <= a) {
        bw.write("DA\n");
      } else {
        bw.write("NE\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}