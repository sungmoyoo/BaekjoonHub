import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int count = 0;
    for (int i = 0; i < 8; i++) {
      char[] state = br.readLine().toCharArray();
      for (int j = 0; j < 8; j++) {
        if (i % 2 == 0) {
          if (j % 2 == 0 && state[j] == 'F') {
            count++;
          }
        } else {
          if (j % 2 == 1 && state[j] == 'F') {
            count++;
          }
        }
      }
    }
    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}