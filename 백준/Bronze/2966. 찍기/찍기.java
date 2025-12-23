import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] adrian = {'A', 'B', 'C'};
    char[] bruno = {'B', 'A', 'B', 'C'};
    char[] goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    int N = Integer.parseInt(br.readLine());
    char[] answers = br.readLine().toCharArray();

    int adrianScore = 0;
    int brunoScore = 0;
    int goranScore = 0;
    int maxScore = Integer.MIN_VALUE;

    for (int i = 0; i < answers.length; i++) {
      if (adrian[i % 3] == answers[i]) {
        adrianScore++;
      }
      if (bruno[i % 4] == answers[i]) {
        brunoScore++;
      }
      if (goran[i % 6] == answers[i]) {
        goranScore++;
      }
    }

    maxScore = Math.max(maxScore, adrianScore);
    maxScore = Math.max(maxScore, brunoScore);
    maxScore = Math.max(maxScore, goranScore);

    bw.write(maxScore + "\n");

    if (maxScore == adrianScore) {
      bw.write("Adrian\n");
    }

    if (maxScore == brunoScore) {
      bw.write("Bruno\n");
    }

    if (maxScore == goranScore) {
      bw.write("Goran\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}