import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N][N];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    while (N > 1) {
      int newN = N / 2;
      int[][] newArr = new int[newN][newN];

      for (int i = 0; i < newN; i++) {
        for (int j = 0; j < newN; j++) {
          int[] block = {
              arr[i*2][j*2],
              arr[i*2][j*2 + 1],
              arr[i*2 + 1][j*2],
              arr[i*2 + 1][j*2 + 1]
          };

          Arrays.sort(block);
          newArr[i][j] = block[2];
        }
      }
      arr = newArr;
      N = newN;
    }

    bw.write(arr[0][0] + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}