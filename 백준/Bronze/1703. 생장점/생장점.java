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
    
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int leafs = 1;

      if (a == 0) {
        break;

      } else {
        for (int i = 0; i < a; i++) {
          int splittingFactor = Integer.parseInt(st.nextToken());
          int cutted = Integer.parseInt(st.nextToken());

          leafs = leafs * splittingFactor - cutted;
        }
      }

      bw.write(leafs + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}