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
      int c = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      int get = c / v;
      int remain = c % v;

      bw.write("You get " + get + " piece(s) and your dad gets " + remain + " piece(s).");
      bw.newLine();
    }

    bw.flush();
    bw.close();
    br.close();
  }
}