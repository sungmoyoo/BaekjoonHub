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
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    String[] apartment = new String[M * 5 +1];

    for (int i = 0; i < 5 * M + 1; i++) {
      apartment[i] = br.readLine();
    }

    int[] typeCount = new int[5];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        int count = 0;
        for (int k = 0; k < 4; k++) {
          int rowIdx = i * 5 + 1 + k;
          String row = apartment[rowIdx].substring(j * 5 + 1, j * 5 + 5);

          if (row.equals("****")) {
            count++;
          } else {
            break;
          }
        }
        typeCount[count]++;
      }
    }

    for (int i = 0; i < 5; i++) {
      bw.write(typeCount[i] + " ");
    }

    bw.write("\n");

    bw.flush();
    bw.close();
    br.close();
  }
}