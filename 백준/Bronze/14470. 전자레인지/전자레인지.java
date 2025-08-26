import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int D = Integer.parseInt(br.readLine());
    int E = Integer.parseInt(br.readLine());

    int second = 0;
    boolean isFreeze = A < 0;
    while (A != B) {
      if (A < 0) {
        A++;
        second += C;
      } else if (A == 0 && isFreeze) {
        second += D;
        isFreeze = false;
      } else {
        A++;
        second += E;
      }
    }

    bw.write(second + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}