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
    int L = Integer.parseInt(st.nextToken());
    int R = Integer.parseInt(st.nextToken());
    int A = Integer.parseInt(st.nextToken());

    int max = Math.max(L, R);
    int min = Math.min(L, R);
    int diff = max - min;

    if (A <= diff) {
      bw.write((min + A) * 2 + "\n");
    } else {
      int remain = A - diff;
      bw.write((max + remain / 2) * 2 + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}