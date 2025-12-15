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



    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] cups = new int[N+1];
    cups[X]++;

    for (int i = 0; i < K; i++) {
      st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      int temp = cups[A];
      cups[A] = cups[B];
      cups[B] = temp;
    }

    for (int i = 1; i <= N; i++) {
      if (cups[i] == 1) {
        bw.write(i + "\n");
        break;
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}