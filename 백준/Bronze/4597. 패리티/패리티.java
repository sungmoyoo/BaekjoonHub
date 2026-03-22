import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input;
    while (!(input = br.readLine()).equals("#")) {
      char[] bit = input.toCharArray();
      int count = 0;
      for (int i = 0; i < bit.length; i++) {
        if (i != bit.length - 1) {
          if (bit[i] == '1') {
            count++;
          }
        } else {
          if (bit[i] == 'e') {
            if (count % 2 == 0) {
              bit[i] = '0';
            } else {
              bit[i] = '1';
            }
          } else {
            if (count % 2 == 0) {
              bit[i] = '1';
            } else {
              bit[i] = '0';
            }
          }
        }
      }

      StringBuilder result = new StringBuilder();
      for (char c : bit) {
        result.append(c);
      }
      
      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}