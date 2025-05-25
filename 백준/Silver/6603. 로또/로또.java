import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int K;
  static int[] S;
  static int[] result = new int[6];
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      K = Integer.parseInt(st.nextToken());

      if (K == 0) break;
      S = new int[K];

      for (int i = 0; i < K; i++) {
        S[i] = Integer.parseInt(st.nextToken());
      }

      dfs(0, 0);

      sb.append("\n");
    }

    bw.write(sb.toString() + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  // 깊이 우선 탐색(백트래킹) 
  private static void dfs(int start, int depth) {
    if (depth == 6) {
      for (int i = 0 ; i < 6; i++) {
        sb.append(result[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = start; i < K; i++) {
      result[depth] = S[i];
      dfs(i+1, depth+1);
    }
  }
}