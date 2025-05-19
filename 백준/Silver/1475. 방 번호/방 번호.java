import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] roomNumber = br.readLine().toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    int count69 = 0;

    for (char c : roomNumber) {
      if (c == '6' || c == '9') {
        count69++;
      } else {
        map.put(c, map.getOrDefault(c, 0) + 1);
      }
    }

    int minSet = 0;

    for (Entry<Character, Integer> e : map.entrySet()) {
      minSet = Math.max(minSet, e.getValue());
    }

    if (count69 % 2 == 0) {
      bw.write(Math.max(minSet, count69 / 2) + "\n");
    } else {
      bw.write(Math.max(minSet, count69 / 2 + 1) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}