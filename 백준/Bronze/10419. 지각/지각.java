import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int time = Integer.parseInt(br.readLine());
      int result = 0;

      for (int i = 0; i <= time; i++) {
        if (i * i + i > time) {
          result = i - 1;
          break;
        }
      }

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}