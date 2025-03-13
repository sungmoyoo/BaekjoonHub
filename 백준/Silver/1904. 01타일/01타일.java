import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int divNum = 15746;

    if (N == 1) {
      bw.write(1 + "\n");
    } else if (N == 2) {
      bw.write(2 + "\n");
    } else {
      int a = 1;
      int b = 2;
      int c = 0;

      for (int i = 3; i <= N; i++) {
        c = (a+b) % divNum;
        a = b;
        b = c;
      }

      bw.write(c + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}