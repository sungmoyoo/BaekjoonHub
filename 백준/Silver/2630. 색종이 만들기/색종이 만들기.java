import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int[][] arr;
  static int countBlue = 0;
  static int countWhite = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    int N = Integer.parseInt(br.readLine());
    arr = new int[N][N];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    cutPaper(0, 0, N);

    bw.write(countWhite + "\n");
    bw.write(countBlue + "\n");

    bw.flush();
    br.close();
    bw.close();
  }

  static void cutPaper(int x, int y, int size) {
    if (isSameColor(x, y, size)) {
      if (arr[x][y] == 0) {
        countWhite++;
      } else {
        countBlue++;
      }
      return;
    }

    int half = size / 2;

    cutPaper(x, y, half);
    cutPaper(x, y + half, half);
    cutPaper(x + half, y, half);
    cutPaper(x + half, y + half, half);
  }


  static boolean isSameColor(int x, int y, int size) {
    int color = arr[x][y];
    for (int i = x; i < x + size; i++) {
      for (int j = y; j < y+ size; j++) {
        if (arr[i][j] != color) {
          return false;
        }
      }
    }
    return true;
  }
}