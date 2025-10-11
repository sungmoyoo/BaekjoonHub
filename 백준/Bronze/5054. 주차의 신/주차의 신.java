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

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int[] shop = new int[n];

      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; i++) {
        shop[i] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(shop);

      int distance = 0;
      for (int i = 1; i < n; i++) {
        distance += shop[i] - shop[i-1];
      }
      distance += shop[n-1] - shop[0];

      bw.write(distance + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }


}