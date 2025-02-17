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

    int N = Integer.parseInt(br.readLine());
    Map<String, Integer> room =  new HashMap<>();

    int result = 0;

    while (N-- > 0) {
      String str = br.readLine();
      if (str.equals("ENTER")) {
        room.clear();

      } else {
        int chatCount = room.getOrDefault(str, 0);

        if (chatCount == 0) {
          result++;
          room.put(str, 1);
        } else {
          room.replace(str, room.get(str)+1);
        }

      }
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}