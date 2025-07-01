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

    int N = Integer.parseInt(br.readLine());
    int[] count = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      count[i] = Integer.parseInt(st.nextToken());
    }

    int[] result = new int[N];

    for (int i = 0; i < N; i++) {
      int taller = count[i];
      for (int j = 0; j < N; j++) {
        if (result[j] == 0) {
          if (taller == 0) {
            result[j] = i + 1;
            break;
          }
          taller--;
        }
      }
    }

    for (int i = 0; i < N; i++) {
      bw.write(result[i] + " ");
    }
    bw.write("\n");


    bw.flush();
    bw.close();
    br.close();
  }
}