import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      String input = br.readLine();
      char x = input.charAt(0);

      if (x == '#') {
        break;
      }

      char[] sentence = input.toLowerCase().toCharArray();
      int count = 0;
      for (int i = 2; i < sentence.length; i++) {
        if (sentence[i] == x) {
          count++;
        }
      }

      bw.write(x + " " + count + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}