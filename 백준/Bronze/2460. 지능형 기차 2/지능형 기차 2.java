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

    int passenger = 0;
    int max = 0;

    for (int i = 0; i < 10; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      passenger -= Integer.parseInt(st.nextToken());
      passenger += Integer.parseInt(st.nextToken());

      max = Math.max(max, passenger);
    }

    bw.write(max + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}