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

    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());

    int[][] sky = new int[H][W];

    for (int i = 0; i < H; i++) {
      char[] arr = br.readLine().toCharArray();
      int lastCloud = -1;

      for (int j = 0; j < W; j++) {
        if (arr[j] == 'c') {
          sky[i][j] = 0;
          lastCloud = j; //
        } else {
          if (lastCloud == -1) {
            sky[i][j] = -1;
          } else {
            sky[i][j] = j - lastCloud;
          }
        }
      }
    }

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        bw.write(sky[i][j] + (j == W - 1 ? "" : " "));
      }
      bw.newLine();
    }

    bw.flush();
    bw.close();
    br.close();
  }
}