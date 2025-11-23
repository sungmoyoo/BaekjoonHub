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

    int maxHelmetDef = 0;
    int maxVestDef = 0;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      maxHelmetDef = Math.max(Integer.parseInt(st.nextToken()), maxHelmetDef);
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      maxVestDef = Math.max(Integer.parseInt(st.nextToken()), maxVestDef);
    }

    bw.write(maxHelmetDef + maxVestDef + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}