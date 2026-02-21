import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String base = br.readLine().substring(0, 5);
    int N = Integer.parseInt(br.readLine());

    int count = 0;
    while (N-- > 0) {
      String sub = br.readLine().substring(0, 5);

      if (base.equals(sub)) {
        count++;
      }
    }

    bw.write(count + "\n");


    bw.flush();
    bw.close();
    br.close();
  }
}