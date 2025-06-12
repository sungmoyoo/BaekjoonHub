import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      int[] length = new int[3];

      StringTokenizer st = new StringTokenizer(br.readLine());
      boolean isEnd = true;

      for (int i = 0; i < 3; i++) {
        length[i] = Integer.parseInt(st.nextToken());
        if (length[i] != 0) {
          isEnd = false;
        }
      }

      if (isEnd) {
        break;
      }

      Arrays.sort(length);

      boolean isRightAngle = Math.pow(length[0], 2) + Math.pow(length[1], 2) == Math.pow(length[2], 2);
      if (isRightAngle) {
        bw.write("right" + "\n");
      } else {
        bw.write("wrong" + "\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}