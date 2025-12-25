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
    String scoreBoard = br.readLine();

    int score = 0;
    int bonusScore = 0;

    for (int i = 1; i <= N; i++) {
      char answer = scoreBoard.charAt(i-1);

      if (answer == 'O') {
        score += i + bonusScore;
        bonusScore++;
      } else {
        bonusScore = 0;
      }
    }

    bw.write(score + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}