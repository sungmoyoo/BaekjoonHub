import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n0;

    int count = 1;
    while ((n0 = Integer.parseInt(br.readLine())) != 0) {
      int n1 = 3 * n0;

      if (n1 % 2 == 0) {
        int n4 = n0 / 2;
        bw.write(count + ". even " + n4);

      } else {
        int n4 = (n0 - 1) / 2;
        bw.write(count + ". odd " + n4);
      }
      count++;
      bw.newLine();
    }

    bw.flush();
    bw.close();
    br.close();
  }
}