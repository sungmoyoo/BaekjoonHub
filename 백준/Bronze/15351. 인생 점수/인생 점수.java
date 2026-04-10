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

    while (N-- > 0) {
      char[] thing = br.readLine().toCharArray();

      int score = 0;
      for (char c : thing) {
        if (c != ' ') {
          score += c - 64;
        }
      }

      if (score == 100) {
        bw.write("PERFECT LIFE\n");
      } else {
        bw.write(score + "\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}