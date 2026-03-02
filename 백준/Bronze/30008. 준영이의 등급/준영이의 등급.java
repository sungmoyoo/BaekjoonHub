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

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < K; i++) {
      int G = Integer.parseInt(st.nextToken());
      int P = G * 100 / N;

      if (P <= 4) {
        bw.write("1 ");
      } else if (P <= 11) {
        bw.write("2 ");
      } else if (P <= 23) {
        bw.write("3 ");
      } else if (P <= 40) {
        bw.write("4 ");
      } else if (P <= 60) {
        bw.write("5 ");
      } else if (P <= 77) {
        bw.write("6 ");
      } else if (P <= 89) {
        bw.write("7 ");
      } else if (P <= 96) {
        bw.write("8 ");
      } else if (P <= 100) {
        bw.write("9 ");
      }
    }
    bw.write("\n");

    bw.flush();
    bw.close();
    br.close();
  }
}