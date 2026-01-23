import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    boolean isSorted = true;
    int before = Integer.MIN_VALUE;

    while (st.hasMoreTokens()) {
      int n = Integer.parseInt(st.nextToken());
      if (before <= n) {
        before = n;
      } else {
        isSorted = false;
        break;
      }
    }

    if (isSorted) {
      bw.write("Good\n");
    } else {
      bw.write("Bad\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}