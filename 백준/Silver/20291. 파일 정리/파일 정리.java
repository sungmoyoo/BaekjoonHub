import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<String, Integer> map = new HashMap<>();

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0) {
      String[] file = br.readLine().split("\\.");
      map.put(file[1], map.getOrDefault(file[1], 0) + 1);
    }

    List<String> keySet = new ArrayList<>(map.keySet());

    Collections.sort(keySet);

    for (String key : keySet) {
      bw.write(key + " ");
      bw.write(map.get(key) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}