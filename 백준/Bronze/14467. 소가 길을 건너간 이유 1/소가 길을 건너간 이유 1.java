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

    int N = Integer.parseInt(br.readLine());
    Map<Integer, Integer> map = new HashMap<>();

    int count = 0;
    while (N-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int cowNum = Integer.parseInt(st.nextToken());
      int position = Integer.parseInt(st.nextToken());

      map.putIfAbsent(cowNum, position);

      if (map.containsKey(cowNum) && map.get(cowNum) != position) {
        count++;
        map.replace(cowNum, position);
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}