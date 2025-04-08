import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int count = 0;
    for (int i = 1; i <= N; i++) {
      if (isHan(i)) {
        count++;
      }
    }

    bw.write(count + "\n");

    bw.flush();
    br.close();
    bw.close();
  }

  private static boolean isHan(int num) {
    if (num < 100) {
      return true;
    }

    int hundred = num / 100;
    int ten = (num/10) % 10;
    int one = num % 10;

    return (hundred - ten) == (ten - one);
  }
}