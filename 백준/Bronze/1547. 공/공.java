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

    int[] cups = {1, 2, 3}; 

    int M = Integer.parseInt(br.readLine());

    while (M-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int X = Integer.parseInt(st.nextToken()) - 1;
      int Y = Integer.parseInt(st.nextToken()) - 1;


      int temp = cups[X];
      cups[X] = cups[Y];
      cups[Y] = temp;
    }


    for (int i = 0; i < 3; i++) {
      if (cups[i] == 1) {
        bw.write((i + 1) + "\n");
        break;
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}