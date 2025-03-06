import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int[] arr;
  static boolean[] visited;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    arr = new int[M];
    visited = new boolean[N+1];

    backtracking(N, M, 0);

    bw.write(new String(sb));

    bw.flush();
    bw.close();
    br.close();
  }
  public static void backtracking(int n, int m, int depth) {
    if (depth == m) {
      for (int num : arr) {
        sb.append(num).append(" ");
      }
      sb.append("\n");
      return;
    }

    int start = (depth == 0) ? 1 : arr[depth - 1] + 1;

    for (int i = start; i <= n; i++) {
      if (!visited[i]) {
        visited[i] = true;
        arr[depth] = i;
        backtracking(n, m, depth+1);
        visited[i] = false;
      }
    }
  }
}


