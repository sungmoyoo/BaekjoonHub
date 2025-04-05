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
    if (N < 10) {
      N *= 10;
    }

    int count = 0;
    int original = N;
    int current = N;

    do {
      int leftNum = current / 10;
      int rightNum = current % 10;
      int sum = leftNum + rightNum;
      current = (rightNum * 10) + (sum % 10);

      count++;
    } while (current != original);

    bw.write(count + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}