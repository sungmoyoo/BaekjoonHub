import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] way = {"N", "E", "S", "W"};
    int idx = 0;

    for (int i = 0; i < 10; i++) {
      int order = Integer.parseInt(br.readLine());

      if (order == 1) {
        idx = idx + 1 > 3 ? 0 : idx + 1;
      } else if (order == 2) {
        idx = idx + 2 > 3 ? idx + 2 - way.length : idx + 2;
      } else {
        idx = idx - 1 < 0 ? 3 : idx - 1;
      }
    }

    bw.write(way[idx] + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}