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
    String L = st.nextToken();

    int label = 1;
    while (N > 0) {
      if (!String.valueOf(label).contains(L)) {
        N--;
      }
      label++;
    }

    bw.write(label - 1 + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}