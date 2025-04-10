import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    Integer[] B = new Integer[N];

    for (int i = 0; i < 2; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
       if (i == 0) {
         A[j] = Integer.parseInt(st.nextToken());
       } else {
         B[j] = Integer.parseInt(st.nextToken());
       }
      }
    }

    Arrays.sort(A);
    Arrays.sort(B, Collections.reverseOrder());

    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += A[i] * B[i];
    }

    bw.write(sum + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
