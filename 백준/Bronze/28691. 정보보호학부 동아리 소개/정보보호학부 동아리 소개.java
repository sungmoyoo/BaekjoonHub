import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char c = br.readLine().charAt(0);

    if (c == 'M') {
      bw.write("MatKor\n");
    } else if (c == 'W') {
      bw.write("WiCys\n");
    } else if (c == 'C') {
      bw.write("CyKor\n");
    } else if (c == 'A') {
      bw.write("AlKor\n");
    } else if (c == '$') {
      bw.write("$clear\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}