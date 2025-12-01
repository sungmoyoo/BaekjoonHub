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

    int T = Integer.parseInt(br.readLine());
    int[] gandalfArmy = {1, 2, 3, 3, 4, 10};
    int[] sauronArmy = {1, 2, 2, 2, 3, 5, 10};

    for (int t = 1; t <= T; t++) {
      int gandalfArmyScore = 0;
      int sauronArmyScore = 0;

      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < 6; i++) {
        int amount = Integer.parseInt(st.nextToken());
        gandalfArmyScore += amount * gandalfArmy[i];
      }

      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < 7; i++) {
        int amount = Integer.parseInt(st.nextToken());
        sauronArmyScore += amount * sauronArmy[i];
      }

      if (gandalfArmyScore > sauronArmyScore) {
        bw.write("Battle " + t + ": Good triumphs over Evil\n");
      } else if (gandalfArmyScore < sauronArmyScore){
        bw.write("Battle " + t + ": Evil eradicates all trace of Good\n");
      } else {
        bw.write("Battle " + t + ": No victor on this battle field\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}