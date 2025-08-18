import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int N;

    while ((N = Integer.parseInt(br.readLine())) != 0) {
      bw.write(calculate(N) + "\n");
    }
    
    bw.flush();
    bw.close();
    br.close();
  }

  private static int calculate(int n) {
    if (n == 1) return 1;

    return n + calculate(n-1);
  }
}