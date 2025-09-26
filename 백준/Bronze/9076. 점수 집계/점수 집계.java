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

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int[] arr = new int[5];

      StringTokenizer st = new StringTokenizer(br.readLine());

      for (int i = 0; i < 5; i++) {
        arr[i] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(arr);
      int[] newArr = Arrays.copyOfRange(arr, 1, 4);

      if (Math.abs(newArr[2] - newArr[0]) >= 4) {
        bw.write("KIN\n");
      } else {
        bw.write(Arrays.stream(newArr).sum() + "\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}