import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int count = 1;
    while (true) {
      String A = br.readLine();
      String B = br.readLine();

      if (A.equals("END") && B.equals("END")) {
        break;
      } else {
        char[] arr1 = A.toCharArray();
        char[] arr2 = B.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        A = Arrays.toString(arr1);
        B = Arrays.toString(arr2);

        if (A.equals(B)) {
          bw.write("Case " + count + ": same\n");
        } else {
          bw.write("Case " + count + ": different\n");
        }

        count++;
      }
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