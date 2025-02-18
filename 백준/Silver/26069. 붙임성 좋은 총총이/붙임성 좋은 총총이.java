import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
  static Map<String, Boolean> isDance =  new HashMap<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int result = 0;

    while (N-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String a = st.nextToken();
      String b = st.nextToken();

      putName(a);
      putName(b);

      if (isDance.getOrDefault(a, Boolean.FALSE) || isDance.getOrDefault(b, Boolean.FALSE)) {
        isDance.replace(a, Boolean.TRUE);
        isDance.replace(b, Boolean.TRUE);
      }
    }

    for (Map.Entry<String, Boolean> e :isDance.entrySet()) {
      if (e.getValue()) {
        result++;
      }
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  private static void putName(String name) {
    if (name.equals("ChongChong")) {
      isDance.putIfAbsent(name, Boolean.TRUE);
    } else {
      isDance.putIfAbsent(name, Boolean.FALSE);
    }
  }

}