import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      List<Integer> even = new ArrayList<>();

      StringTokenizer st = new StringTokenizer(br.readLine());
      int sum = 0;
      for (int i = 0; i < 7; i++) {
        int n = Integer.parseInt(st.nextToken());
        if (n % 2 == 0) {
          even.add(n);
          sum += n;
        }
      }

      Collections.sort(even);

      bw.write(sum + " ");
      bw.write(even.get(0) + "\n");

    }

    bw.flush();
    bw.close();
    br.close();
  }
}