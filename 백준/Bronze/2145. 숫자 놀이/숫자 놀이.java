import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s;

    while (!(s = br.readLine()).equals("0")) {
      while (s.length() > 1) {
        int sum = 0;
        for (char c : s.toCharArray()) {
          sum += c - '0';
        }
        s = Integer.toString(sum);
      }

      bw.write(s + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}