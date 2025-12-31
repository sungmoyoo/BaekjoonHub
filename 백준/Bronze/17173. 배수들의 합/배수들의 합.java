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
    int[] K = new int[M];

    int sum = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      K[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < M; j++) {
        if (i % K[j] == 0) {
          sum += i;
          break;
        }
      }
    }

    bw.write(sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}