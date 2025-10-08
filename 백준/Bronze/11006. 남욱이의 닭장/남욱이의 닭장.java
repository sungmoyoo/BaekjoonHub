import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int legs = Integer.parseInt(st.nextToken());
      int chickens = Integer.parseInt(st.nextToken());
      int totalLeg = 2 * chickens;

      int cutLegs = totalLeg - legs;
      int T = chickens - cutLegs;
      int U = chickens - T;

      bw.write(U + " " + T + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}