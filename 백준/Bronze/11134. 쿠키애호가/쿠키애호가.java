import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      int count = 0;
      while (N != 0) {
        if (N < C) {
          N = 0;
        } else {
          N -= C;
        }
        count++;
      }

      bw.write(count + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}