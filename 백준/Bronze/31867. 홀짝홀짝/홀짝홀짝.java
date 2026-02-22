import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    char[] arr = br.readLine().toCharArray();

    int even = 0;
    int odd = 0;

    for (char c : arr) {
      int n = Character.getNumericValue(c);
      if (n == 0) {
        even++;
      } else {
        if (n % 2 == 0) {
          even++;
        } else {
          odd++;
        }
      }
    }

    if (even > odd) {
      bw.write("0\n");
    } else if (even < odd) {
      bw.write("1\n");
    } else {
      bw.write("-1\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}