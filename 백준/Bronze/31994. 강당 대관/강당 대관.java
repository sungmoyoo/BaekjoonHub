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
    StringTokenizer st;

    int max = Integer.MIN_VALUE;
    Map<Integer, String> map = new HashMap<>();

    for (int i = 0; i < 7; i++) {
      st = new StringTokenizer(br.readLine());
      String seminar = st.nextToken();
      int students = Integer.parseInt(st.nextToken());

      map.put(students, seminar);

      max = Math.max(max, students);
    }

    bw.write(map.get(max) + "\n");
    
    bw.flush();
    bw.close();
  }
}