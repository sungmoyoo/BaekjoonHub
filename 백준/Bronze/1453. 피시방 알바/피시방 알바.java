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

    int[] seats = new int[101];
    StringTokenizer st = new StringTokenizer(br.readLine());

    int reject = 0;
    for (int i = 0; i < N; i++) {
      int wantNum = Integer.parseInt(st.nextToken());
      if (seats[wantNum] == 1) {
        reject++;
      } else {
        seats[wantNum]++;
      }
    }

    bw.write(reject + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}