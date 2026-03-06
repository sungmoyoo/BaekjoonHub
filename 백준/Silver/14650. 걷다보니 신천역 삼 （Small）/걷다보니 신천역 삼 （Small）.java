import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    if (N == 1) {
      bw.write("0\n");
    } else {
      bw.write(2 * ((int) Math.pow(3, (N-2))) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}