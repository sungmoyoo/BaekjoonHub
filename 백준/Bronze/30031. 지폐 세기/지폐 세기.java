import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<Integer, Integer> map = new HashMap<>();
    map.put(136, 1000);
    map.put(142, 5000);
    map.put(148, 10000);
    map.put(154, 50000);

    int N = Integer.parseInt(br.readLine());

    int sum = 0;
    while (N-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int w = Integer.parseInt(st.nextToken());
      int h = Integer.parseInt(st.nextToken());

      sum += map.get(w);
    }

    bw.write(sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}