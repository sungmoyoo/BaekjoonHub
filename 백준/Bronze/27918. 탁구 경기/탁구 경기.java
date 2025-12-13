import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int X = 0;
    int Y = 0;

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0) {
      String winner = br.readLine();
      if (winner.equals("D")) {
        X++;
      } else {
        Y++;
      }

      if (Math.abs(X-Y) > 1) {
        break;
      }
    }

    bw.write(X + ":" + Y + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}