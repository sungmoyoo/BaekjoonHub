import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int total = Integer.parseInt(br.readLine());
    int sum = 0;

    for (int i = 0; i < 9; i++) {
      sum += Integer.parseInt(br.readLine());
    }

    bw.write(total - sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}