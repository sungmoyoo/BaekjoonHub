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
    int M = Integer.parseInt(st.nextToken());
    int seatNumber = Integer.parseInt(st.nextToken());

    int count = 0;
    loop :
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (count == seatNumber) {
          bw.write(i + " " + j + "\n");
          break loop;
        }
        count++;
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}