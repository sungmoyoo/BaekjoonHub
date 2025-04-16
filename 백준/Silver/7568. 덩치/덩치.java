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

    int[] weights = new int[N];
    int[] heights = new int[N];
    int[] result = new int[N];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      weights[i] = Integer.parseInt(st.nextToken());
      heights[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < N; i++) {
      int count = 0;
      for (int j = 0; j < N; j++) {
        if (weights[i] < weights[j] && heights[i] < heights[j]) {
          count++;
        }
      }

      result[i] = count+1;
    }

    for (int n : result) {
      bw.write(n + " ");
    }
    bw.write("\n");

    bw.flush();
    br.close();
    bw.close();
  }

}
