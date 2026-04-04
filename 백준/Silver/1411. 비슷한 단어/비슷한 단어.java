import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    List<String> patterns = new ArrayList<>();

    while (N-- > 0) {
      char[] arr = br.readLine().toCharArray();
      Map<Character, Integer> map = new HashMap<>();
      StringBuilder sb = new StringBuilder();

      int idx = 0;
      for (char c : arr) {
        map.putIfAbsent(c, idx++);
        sb.append(map.get(c));
      }
      patterns.add(String.valueOf(sb));
    }

    int result = 0;
    for (int i = 0; i < patterns.size()-1; i++) {
      for (int j = i+1; j < patterns.size(); j++) {
        if (patterns.get(i).equals(patterns.get(j))) {
          result++;
        }
      }
    }

    bw.write(result + "\n");


    bw.flush();
    bw.close();
    br.close();
  }
}