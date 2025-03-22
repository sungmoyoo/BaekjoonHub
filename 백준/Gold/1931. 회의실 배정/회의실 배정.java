import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[][] meetings = new int[N][2];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      meetings[i][0] = Integer.parseInt(st.nextToken());
      meetings[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(meetings, (o1, o2) -> {
        if (o1[1] == o2[1]) {
          return o1[0] - o2[0];
        }
        return o1[1] - o2[1];
    });

    int count = 0;
    int endTime= 0;

    for (int i = 0; i < N; i++) {
      if (meetings[i][0] >= endTime) {
        count++;
        endTime = meetings[i][1];
      }
    }

    bw.write(count + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}