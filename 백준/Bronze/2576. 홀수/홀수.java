import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int result = Integer.MAX_VALUE;
    int sum = 0;

    for (int i = 0; i < 7; i++) {
      int N = Integer.parseInt(br.readLine());

      if (N % 2 != 0) {
        sum += N;
        result = Math.min(result, N);
      }
    }

    if (result == Integer.MAX_VALUE) {
      bw.write(-1 + "\n");
    } else {
      bw.write(sum + "\n");
      bw.write(result + "\n");
    }
    
    bw.flush();
    br.close();
    bw.close();
  }
}