import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());

    int N = Integer.parseInt(br.readLine());
    int maxScore = 0;

    for (int i = 0; i < N; i++) {
      int score = 0;
      for (int j = 0; j < 3; j++) {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        score += (a * A) + (b * B) + (c * C);
      }

      maxScore = Math.max(maxScore, score);
    }

    bw.write(maxScore + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}