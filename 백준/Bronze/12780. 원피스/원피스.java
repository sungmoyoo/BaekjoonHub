import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String H = br.readLine();
    String N = br.readLine();

    int count = 0;
    for (int i = 0; i <= H.length()-N.length(); i++) {
      if (H.startsWith(N, i)) {
        count++;
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
  }
}