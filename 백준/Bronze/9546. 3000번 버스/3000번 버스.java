import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      int k = Integer.parseInt(br.readLine());
      double passenger = 0;

      for (int i = 0; i < k; i++) {
        passenger += 0.5;
        passenger += passenger;
      }
      bw.write((int) passenger + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}