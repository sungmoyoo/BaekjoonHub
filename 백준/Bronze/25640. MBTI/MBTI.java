import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String jinho = br.readLine();
    int n = Integer.parseInt(br.readLine());

    int count = 0;
    while (n-- > 0) {
      String friend = br.readLine();
      if (jinho.equals(friend)) {
        count++;
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}