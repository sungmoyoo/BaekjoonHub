import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int result;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    result = 0;
    separating(N);

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  private static void separating(int n) {
    int rest = n - n / 2;
    result += (n / 2) * rest;

    if (n > 1) {
      separating(n / 2);
    }
    if (rest > 1) {
      separating(rest);
    }
  }
}