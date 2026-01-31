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
    int M = Integer.parseInt(st.nextToken());

    int[] A = new int[N];
    int[] box = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    int idx = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      int B = Integer.parseInt(st.nextToken());

      while (A[idx] < box[idx] + B) {
        idx++;
      }

      box[idx] += B;
    }

    int result = 0;
    for (int i = 0; i < N; i++) {
      result += A[i] - box[i];
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}