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
    int sec = 0;
    int K = 1;
    while (N > 0) {
      if (N - K < 0) {
        K = 1;
      }

      N -= K;
      K++;
      sec++;
    }

    bw.write(sec + "\n");


    bw.flush();
    bw.close();
    br.close();
  }
}