import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int[][] arr;
  static StringBuffer sb = new StringBuffer();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    arr = new int[N][N];

    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split("");
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(input[j]);
      }
    }

    quadTree(0, 0, N);

    bw.write(sb + "\n");

    bw.flush();
    br.close();
    bw.close();
  }

  static void quadTree(int x, int y, int size) {
    if (isSamePoint(x, y, size)) {
      if (arr[x][y] == 0) {
        sb.append(0);
      } else {
        sb.append(1);
      }
    } else {
      sb.append("(");
      int half = size / 2;

      quadTree(x, y, half);
      quadTree(x, y + half, half);
      quadTree(x + half, y, half);
      quadTree(x + half, y + half, half);
      sb.append(")");
    }
  }

  static boolean isSamePoint(int x, int y, int size) {
    int point = arr[x][y];
    for (int i = x; i < x + size; i++) {
      for (int j = y; j < y+ size; j++) {
        if (arr[i][j] != point) {
          return false;
        }
      }
    }
    return true;
  }
}