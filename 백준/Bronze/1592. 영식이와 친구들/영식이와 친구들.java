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

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    int[] count = new int[N + 1];
    int current = 1;
    int throwsCount = 0;

    count[current] = 1;

    while (true) {
      if (count[current] == M) {
        break;
      }

      if (count[current] % 2 == 1) {
        current = (current + L - 1) % N + 1;
      } else {
        current = (current - L - 1 + N) % N + 1;
      }

      count[current]++;
      throwsCount++;
    }

    bw.write(throwsCount + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}