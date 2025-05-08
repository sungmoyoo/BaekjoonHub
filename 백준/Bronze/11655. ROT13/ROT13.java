import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] arr = br.readLine().toCharArray();

    for (char c : arr) {
      if (!Character.isDigit(c)) {
        if (c >= 'A' && c <= 'Z') {
          c = (char) (((c-'A' + 13) % 26) + 'A');
        } else if (c >= 'a' && c <= 'z') {
          c = (char) (((c-'a' + 13) % 26) + 'a');
        }
      }
      bw.write(c);
    }
    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}