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

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      if (A == 0 && B == 0) break;

      if (A > B) {
        bw.write("Yes");
      } else {
        bw.write("No");
      }

      bw.newLine();
    }

    bw.flush();
    bw.close();
    br.close();
  }
}