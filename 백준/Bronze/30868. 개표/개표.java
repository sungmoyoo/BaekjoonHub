import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int vote = Integer.parseInt(br.readLine());
      int count = vote / 5;
      vote %= 5;

      for (int i = 0; i < count; i++) {
        bw.write("++++ ");
      }

      for (int i = 0; i < vote; i++) {
        bw.write("|");
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}