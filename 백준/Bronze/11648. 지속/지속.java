import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int n = N;
    int count = 0;

    while (true) {
      if (n >= 10) {
        n = multiple(n);
        count++;
      } else {
        break;
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  private static int multiple(int n) {
    char[] arr = String.valueOf(n).toCharArray();

    int result = 1;
    for (char c : arr) {
      result *= Character.getNumericValue(c);
    }

    return result;
  }
}