import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    int count = 1;
    while (c != 1) {
      if (c % 2 == 0) {
        c = c / 2;
      } else {
        c = 3 * c + 1;
      }
      count++;
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}