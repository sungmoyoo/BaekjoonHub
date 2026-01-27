import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      long A = Long.parseLong(st.nextToken());
      String calculation = st.nextToken();
      long B = Long.parseLong(st.nextToken());
      String equals = st.nextToken();
      long result = Long.parseLong(st.nextToken());

      if (calculation.equals("+")) {
        if (A + B == result) {
          bw.write("correct\n");
        } else {
          bw.write("wrong answer\n");
        }
      } else if (calculation.equals("-")) {
        if (A - B == result) {
          bw.write("correct\n");
        } else {
          bw.write("wrong answer\n");
        }
      } else if (calculation.equals("*")) {
        if (A * B == result) {
          bw.write("correct\n");
        } else {
          bw.write("wrong answer\n");
        }
      } else if (calculation.equals("/")) {
        if ((A / B) == result) {
          bw.write("correct\n");
        } else {
          bw.write("wrong answer\n");
        }
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}