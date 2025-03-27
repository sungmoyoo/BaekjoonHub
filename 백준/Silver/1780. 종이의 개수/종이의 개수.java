import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int[][] arr;
  static int countZero = 0;
  static int countMinusOne = 0;
  static int countPlusOne = 0;

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

    bw.write(countMinusOne + "\n");
    bw.write(countZero + "\n");
    bw.write(countPlusOne + "\n");

    bw.flush();
    br.close();
    bw.close();
  }

  static void cutPaper(int x, int y, int size) {
    if (isSamePoint(x, y, size)) {
      if (arr[x][y] == 0) {
        countZero++;
      } else if (arr[x][y] == 1) {
        countPlusOne++;
      } else {
        countMinusOne++;
      }
      return;
    }
      int cutSize = size / 3;

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          cutPaper(x + cutSize * i, y + cutSize * j, cutSize);
        }
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