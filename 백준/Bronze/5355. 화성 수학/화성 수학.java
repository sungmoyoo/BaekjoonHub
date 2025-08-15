import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      String[] tests = br.readLine().split(" ");
      float n = Float.parseFloat(tests[0]);


      for (int i = 1; i < tests.length; i++) {
        if (tests[i].equals("@")) {
          n *= 3;
        } else if (tests[i].equals("%")) {
          n += 5;
        } else if (tests[i].equals("#")) {
          n -= 7;
        }
      }

      System.out.printf("%.2f\n", n);
    }
    
    br.close();
  }
}