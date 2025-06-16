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

    int score = 0;
    int plus = 1;
    boolean isSequence = false;

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int answer = Integer.parseInt(st.nextToken());

      if (answer == 1) {
        if (!isSequence) {
          isSequence = true;
        } else {
          plus++;
        }

        score += plus;

      } else {
        plus = 1;
        isSequence = false;
      }
    }

    bw.write(score + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}