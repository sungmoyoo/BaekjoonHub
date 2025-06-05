import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int largestNum = 0;

    int maxPrice = 0;
    while (N-- > 0) {
      Map<Integer, Integer> map = new HashMap<>();
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < 3; i++) {
        int num = Integer.parseInt(st.nextToken());
        map.put(num, map.getOrDefault(num, 0) + 1);
      }

      int price = 0;
      for (Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 3) {
          price = 10000 + entry.getKey() * 1000;
        } else if (entry.getValue() == 2) {
          price = 1000 + entry.getKey() * 100;
        } else {
          price = Collections.max(map.keySet()) * 100;
        }
      }

      maxPrice = Math.max(maxPrice, price);
    }

    bw.write(maxPrice + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}