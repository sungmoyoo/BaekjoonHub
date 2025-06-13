import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    Map<Character, Integer> map = new HashMap<>();

    while (N-- > 0) {
      char name = br.readLine().charAt(0);
      map.put(name, map.getOrDefault(name, 0)+1);
    }
    boolean isPredaja = true;
    for (Entry e : map.entrySet()) {
      if ((int) e.getValue() >= 5) {
        isPredaja = false;
        bw.write(String.valueOf(e.getKey()));
      }
    }

    if (isPredaja) {
      bw.write("PREDAJA");
    }

    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}