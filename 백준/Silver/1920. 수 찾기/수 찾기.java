import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int[] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      int X = Integer.parseInt(st.nextToken());

      if (binarySearch(0, N-1, X)) {
        bw.write(1 + "\n");
      } else {
        bw.write(0 + "\n");
      }
    }

    bw.flush();
    br.close();
    bw.close();
  }

  static boolean binarySearch(int start, int end, int x) {
    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == x) {
        return true;

      } else if (arr[mid] > x) {
        end = mid-1;

      } else {
        start = mid+1;

      }
    }
    return false;
  }
}