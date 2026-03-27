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
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] x = new int[2];
    int[] y = new int[2];

    int idx = 0;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        int n = Integer.parseInt(st.nextToken());
        if (n == 1) {
          x[idx] = i;
          y[idx] = j;
          idx++;
        }
      }
    }

    bw.write(Math.abs(x[1] - x[0]) + Math.abs(y[1] - y[0]) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}