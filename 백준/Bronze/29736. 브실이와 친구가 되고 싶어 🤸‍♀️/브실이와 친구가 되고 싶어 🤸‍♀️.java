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
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int K = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    int count = 0;
    for (int i = A; i <= B; i++) {
      if (i >= K - X && i <= K + X) {
        count++;
      }
    }

    if (count != 0) {
      bw.write(count + "\n");
    } else {
      bw.write("IMPOSSIBLE\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}