import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long N = Long.parseLong(br.readLine());

    long X = (N + 1) * ((N - 1) * N) / 2;

    bw.write(X + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}