import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line;
    int count = 0;

    while ((line = br.readLine()) != null && count < 100) {
      bw.write(line);
      bw.newLine();
      count++;
    }

    bw.flush();
    br.close();
    bw.close();
  }
}
