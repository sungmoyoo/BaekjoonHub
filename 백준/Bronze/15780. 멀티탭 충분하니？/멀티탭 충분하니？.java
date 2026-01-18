import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int count = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < K; i++) {
      int A = Integer.parseInt(st.nextToken());
      if (A % 2 == 0) {
        count += A / 2;
      } else {
        count += A / 2 + 1;
      }
    }

    if (count >= N) {
      bw.write("YES\n");
    } else {
      bw.write("NO\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}