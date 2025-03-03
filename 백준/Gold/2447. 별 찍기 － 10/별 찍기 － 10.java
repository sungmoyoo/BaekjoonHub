import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    char[][] arr = new char[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        arr[i][j] = '*';
      }
    }

    solution(arr, 0, 0, N);
    for (int i = 0; i < N; i++) {
      bw.write(new String(arr[i]) + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }

  public static void solution(char[][] arr, int x, int y, int size) {
    if (size < 3) {
      return;
    }

    int part = size / 3;

    for (int i = x + part; i < x + 2 * part; i++) {
      for (int j = y + part; j < y + 2 * part; j++) {
        arr[i][j] = ' ';
      }
    }

    for (int dx = 0; dx < 3; dx++) {
      for (int dy = 0; dy < 3; dy++) {
        if (dx == 1 && dy == 1) {
          continue;
        }
        solution(arr, x + dx * part, y + dy * part, part);
      }
    }
  }
}


