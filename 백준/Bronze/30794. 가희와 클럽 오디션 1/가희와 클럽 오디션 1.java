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
    int lv = Integer.parseInt(st.nextToken());
    String timing = st.nextToken();

    if (timing.equals("miss")) {
      bw.write("0\n");
    } else if (timing.equals("bad")) {
      bw.write(200 * lv + "\n");
    } else if (timing.equals("cool")) {
      bw.write(400 * lv + "\n");
    } else if (timing.equals("great")) {
      bw.write(600 * lv + "\n");
    } else {
      bw.write(1000 * lv + "\n");
    }


    bw.flush();
    bw.close();
    br.close();
  }
}