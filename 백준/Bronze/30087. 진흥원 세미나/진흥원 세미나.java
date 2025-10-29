import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<String, String> map = new HashMap<>();
    map.put("Algorithm", "204");
    map.put("DataAnalysis", "207");
    map.put("ArtificialIntelligence", "302");
    map.put("CyberSecurity", "B101");
    map.put("Network", "303");
    map.put("Startup", "501");
    map.put("TestStrategy", "105");

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0) {
      String className = br.readLine();
      bw.write(map.get(className) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}