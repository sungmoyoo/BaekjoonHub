import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] players = new int[4];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < 4; i++) {
      players[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(players);

    int result = Math.abs((players[0] + players[3]) - (players[1] + players[2]));

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}