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

    if (c == 'N' || c == 'n') {
      bw.write("Naver D2\n");
    } else {
      bw.write("Naver Whale");
    }
    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}