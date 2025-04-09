import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int[][] room = new int[15][15];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (int i = 0; i < 15; i++) {
      room[0][i] = i + 1;
    }

    for (int k = 1; k < 15; k++) {
      for (int n = 0; n < 15; n++) {
        for (int i = 0; i <= n; i++) {
          room[k][n] += room[k - 1][i];
        }
      }
    }

    int T = Integer.parseInt(br.readLine());

    for (int t = 0; t < T; t++) {
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      bw.write(room[k][n - 1] + "\n");
    }
    
    bw.flush();
    br.close();
    bw.close();
  }
}
