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
    int[] area = new int[5];
    while (n-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      if (x == 0 || y == 0) {
        area[4]++;
      } else if (x > 0 && y > 0) {
        area[0]++;
      } else if (x < 0 && y > 0 ) {
        area[1]++;
      } else if (x < 0 && y < 0) {
        area[2]++;
      } else if (x > 0 && y < 0) {
        area[3]++;
      }
    }

    bw.write("Q1: " + area[0] + "\n");
    bw.write("Q2: " + area[1] + "\n");
    bw.write("Q3: " + area[2] + "\n");
    bw.write("Q4: " + area[3] + "\n");
    bw.write("AXIS: " + area[4] + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}