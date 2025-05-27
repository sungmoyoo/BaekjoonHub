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
    int[] participants = new int[5];

    int winner = 0;
    int max = 0;

    for (int i = 0; i < participants.length; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int sum = 0;
      for (int j = 0; j < 4; j++) {
        sum += Integer.parseInt(st.nextToken());
      }

      if (max < sum) {
        max = sum;
        winner = i;
      }
    }
    bw.write(winner+1 + " " + max + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}