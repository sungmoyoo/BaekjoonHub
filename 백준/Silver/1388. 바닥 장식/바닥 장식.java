import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int N, M;
  static char[][] floor;
  static boolean[][] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    floor = new char[N][M];
    visited = new boolean[N][M];

    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      for (int j = 0; j < M; j++) {
        floor[i][j] = line.charAt(j);
      }
    }

    int count = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (!visited[i][j]) {
          expand(i, j);
          count++;
        }
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  private static void expand(int x, int y) {
    visited[x][y] = true;

    if (floor[x][y] == '-') {
      int ny = y + 1;
      while (ny < M && floor[x][ny] == '-' && !visited[x][ny]) {
        visited[x][ny] = true;
        ny++;
      }
    } else if (floor[x][y] == '|') {
      int nx = x + 1;
      while (nx < N && floor[nx][y] == '|' && !visited[nx][y]) {
        visited[nx][y] = true;
        nx++;
      }
    }
  }
}