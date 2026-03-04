import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    while (N-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      List<Integer> M = new ArrayList<>();

      while (st.hasMoreTokens()) {
        M.add(Integer.parseInt(st.nextToken()));
      }

      int maxGCD = Integer.MIN_VALUE;
      for (int i = 0; i < M.size()-1; i++) {
        for (int j = i+1; j < M.size(); j++) {
          maxGCD = Math.max(maxGCD, gcd(M.get(i), M.get(j)));
        }
      }
      bw.write(maxGCD + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }

  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else return gcd(b, a % b);
  }
}