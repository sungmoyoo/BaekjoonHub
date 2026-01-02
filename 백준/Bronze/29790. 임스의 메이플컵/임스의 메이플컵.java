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
    int U = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    if (N >= 1000) {
      if (U >= 8000 || L >= 260) {
        bw.write("Very Good\n");
      } else {
        bw.write("Good\n");
      }
    } else {
      bw.write("Bad\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}