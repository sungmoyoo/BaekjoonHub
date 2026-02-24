import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] slimes = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      slimes[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(slimes);

    int sum = slimes[N-1] + slimes[N-2];
    int score = slimes[N-1] * slimes[N-2];

    for (int i = N-3; i >= 0; i--) {
      score += sum * slimes[i];
      sum += slimes[i];
    }

    bw.write(score + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}