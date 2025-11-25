import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();
    long result = 1;

    for (int i = 0; i < input.length(); i++) {
      char cur = input.charAt(i);

      if (i == 0) {
        result *= (cur == 'c' ? 26 : 10);

      } else {
        char prev = input.charAt(i-1);

        if (cur == prev) {
          result *= (cur == 'c' ? 25 : 9);

        } else {
          result *= (cur == 'c' ? 26 : 10);

        }
      }
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}