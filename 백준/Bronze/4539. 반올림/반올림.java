import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      int input = Integer.parseInt(br.readLine());
      int div = 10;
      int num = input;

      while (num >= div) {
        num = (int) Math.round((double) num / div) * div;
        div *= 10;
      }

      bw.write(num + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}