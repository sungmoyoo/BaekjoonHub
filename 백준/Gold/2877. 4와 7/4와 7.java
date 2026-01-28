import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Long K = Long.parseLong(br.readLine()) + 1;

    String s = Long.toBinaryString(K);

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '0') {
        sb.append("4");
      } else {
        sb.append("7");
      }
    }

    bw.write(sb + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}