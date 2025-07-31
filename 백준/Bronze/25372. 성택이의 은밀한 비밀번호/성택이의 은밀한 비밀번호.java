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
      char[] password = br.readLine().toCharArray();

      if (password.length >= 6 && password.length <= 9) {
        bw.write("yes\n");
      } else {
        bw.write("no\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}