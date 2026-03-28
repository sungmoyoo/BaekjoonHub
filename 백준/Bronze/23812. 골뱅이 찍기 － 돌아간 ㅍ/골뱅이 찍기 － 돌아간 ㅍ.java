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

    for (int i = 0; i < N * 5; i++) {
      for (int j = 0; j < N * 5; j++) {
        if (j < N ||
            j >= N * 5 - N ||
            (i >= N && i < N * 2) ||
            (i >= N * 3 && i < N * 4)) {
          bw.write("@");
        } else {
          bw.write(" ");
        }
      }
      bw.write("\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}