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

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int n = Integer.parseInt(br.readLine());
      Map<String, Integer> map = new HashMap<>();

      for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        String type = st.nextToken();
        map.put(type, map.getOrDefault(type, 0) + 1);
      }

      int result = 1;
      for (int count : map.values()) {
        result *= (count + 1);
      }
      result--;

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}