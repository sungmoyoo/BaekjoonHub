import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = 0;

    for (int i = 0; i < N; i++) {
      sum += Integer.parseInt(st.nextToken());
    }

    if (sum >= T) {
      bw.write("Padaeng_i Happy\n");
    } else {
      bw.write("Padaeng_i Cry\n");
    }


    bw.flush();
    bw.close();
    br.close();
  }
}