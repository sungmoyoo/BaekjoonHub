import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    bw.write(factorial(N) + "\n");

    bw.flush();
    br.close();
    bw.close();
  }

  public static long factorial(int n) {
    if (n < 2) {
      return 1;
    }

    return n * factorial(n-1);
  }
}


