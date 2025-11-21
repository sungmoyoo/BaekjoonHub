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

    int N = Integer.parseInt(br.readLine());
    int[] scores = new int[N];
    int[][] input = new int[N][3];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 3; j++) {
        input[i][j] = Integer.parseInt(st.nextToken());;
      }
    }

    for (int game = 0; game < 3; game++) {
      int[] count = new int[101];

      for (int i = 0; i < N; i++) {
        count[input[i][game]]++;
      }

      for (int i = 0; i < N; i++) {
        int v = input[i][game];
        if (count[v] == 1) {
          scores[i] += v;
        }
      }
    }

    for (int s : scores) {
      bw.write(s + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}