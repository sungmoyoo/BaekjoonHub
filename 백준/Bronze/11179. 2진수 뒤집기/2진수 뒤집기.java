import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    while (N > 1) {
      sb.append(N % 2);
      N /= 2;
    }
    sb.append(N);
    sb.reverse();

    int result = 0;
    for (int i = 0; i < sb.length(); i++) {
      if (i == 0 && sb.charAt(i) == '0') {
        continue;
      }
      result += (int) (Character.getNumericValue(sb.charAt(i)) * Math.pow(2, i));
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}