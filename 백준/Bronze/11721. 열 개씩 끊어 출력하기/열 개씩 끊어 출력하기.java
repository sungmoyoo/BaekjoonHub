import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int maxN = 46;
  static Long[] dp = new Long[maxN];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] word = br.readLine().split("");
    int count = 0;
    StringBuilder sb = new StringBuilder();

    for (String s : word) {
      if (count == 10) {
        bw.write(sb + "\n");
        sb = new StringBuilder();
        count = 0;
      }

      sb.append(s);
      count++;
    }

    bw.write(sb + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
