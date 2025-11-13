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

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int total = 0;
    int max = 0;

    for (int i = 0; i < n; i++) {
      int cost = Integer.parseInt(st.nextToken());
      total += cost;
      if (cost > max) {
        max = cost;
      }
    }

    bw.write((total - max) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}