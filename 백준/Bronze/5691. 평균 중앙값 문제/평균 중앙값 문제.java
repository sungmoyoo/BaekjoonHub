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

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      long A = Long.parseLong(st.nextToken());
      long B = Long.parseLong(st.nextToken());

      if (A == 0 && B == 0) {
        break;
      }

      long bigger = Math.min(A, B);
      long result = bigger * 3 - (A + B);
      
      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}