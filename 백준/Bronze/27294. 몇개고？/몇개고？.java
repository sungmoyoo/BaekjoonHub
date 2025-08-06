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

    int T = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());

    if (T < 12 || T > 16) {
      bw.write(280 + "\n");
    } else {
      if (S == 1) {
        bw.write(280 + "\n");
      } else {
        bw.write(320 + "\n");
      }
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}