import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int result = Integer.parseInt(br.readLine());

    String input;
    int count = 1;
    String symbol = null;
    while (!(input = br.readLine()).equals("=")) {
      if (count % 2 == 0) {
        if (symbol.equals("+")) {
          result += Integer.parseInt(input);
        } else if (symbol.equals("-")) {
          result -= Integer.parseInt(input);
        } else if (symbol.equals("*")) {
          result *= Integer.parseInt(input);
        } else if (symbol.equals("/")) {
          result /= Integer.parseInt(input);
        }
      } else {
        symbol = input;
      }
      count++;
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}