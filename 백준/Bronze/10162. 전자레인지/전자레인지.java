import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static final int A = 300;
  static final int B = 60;
  static final int C = 10;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int time = Integer.parseInt(br.readLine());

    if (time % A % B % C != 0) {
      bw.write("-1");
    } else {
      bw.write(time / A + " ");
      time %= A;
      bw.write(time / B + " ");
      time %= B;
      bw.write(time / C + " ");
    }

    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}