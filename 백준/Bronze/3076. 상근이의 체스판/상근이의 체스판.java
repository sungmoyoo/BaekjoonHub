import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int R = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    for (int i = 0; i < R; i++) {
      StringBuilder sb = new StringBuilder();

      for (int j = 0; j < C; j++) {
        if ((i + j) % 2 == 0) {
          for (int k = 0; k < B; k++) {
            sb.append("X");
          }
        } else {
          for (int k = 0; k < B; k++) {
            sb.append(".");
          }
        }
      }

      for (int k = 0; k < A; k++) {
        bw.write(sb + "\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}