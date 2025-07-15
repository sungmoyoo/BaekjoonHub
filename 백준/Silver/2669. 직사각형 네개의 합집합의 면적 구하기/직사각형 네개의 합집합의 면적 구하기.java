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

    int[][] area = new int[101][101];

    for (int i = 0; i < 4; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      for (int j = x1; j < x2; j++) {
        for (int k = y1; k < y2; k++) {
          area[j][k] = 1;
        }
      }
    }

    int count = 0;
    for (int i = 0; i < area.length; i++) {
      for (int j = 0; j < area.length; j++) {
        if (area[i][j] == 1) {
          count++;
        }
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}