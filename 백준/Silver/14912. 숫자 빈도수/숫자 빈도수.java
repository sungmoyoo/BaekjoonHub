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
    int n = Integer.parseInt(st.nextToken());
    char d = st.nextToken().charAt(0);

    int count = 0;

    for (int i = 1; i <= n; i++) {
      String num = String.valueOf(i);
      for (int j = 0; j < num.length(); j++) {
        if (num.charAt(j) == d) {
          count++;
        }
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}