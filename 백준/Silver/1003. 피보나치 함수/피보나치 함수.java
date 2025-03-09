import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int maxN = 40;
    int[] countZero = new int[maxN + 1];
    int[] countOne = new int[maxN + 1];

    countZero[0] = 1;
    countZero[1] = 0;
    countOne[0] = 0;
    countOne[1] = 1;

    int T = Integer.parseInt(br.readLine());

    for (int i = 2; i <= 40; i++) {
      countZero[i] = countZero[i-1] + countZero[i-2];
      countOne[i] = countOne[i-1] + countOne[i-2];
    }

    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      bw.write(countZero[N] + " " + countOne[N] + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}