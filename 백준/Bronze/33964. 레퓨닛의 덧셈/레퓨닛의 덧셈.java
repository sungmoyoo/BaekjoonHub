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
    int X = Integer.parseInt(st.nextToken());
    int Y = Integer.parseInt(st.nextToken());

    int result = repunit(X) + repunit(Y);

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  private static int repunit(int n) {
    StringBuilder sb = new StringBuilder();
    while (n-- > 0) {
      sb.append(1);
    }

    return Integer.parseInt(String.valueOf(sb));
  }
}