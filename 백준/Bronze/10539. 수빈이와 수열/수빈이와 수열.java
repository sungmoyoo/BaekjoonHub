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

    int[] A = new int[N];
    int[] B = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(st.nextToken());
    }
    
    A[0] = B[0];
    int sum = A[0];

    for (int i = 1; i < N; i++) {
      A[i] = (B[i] * (i+1)) - sum;
      sum += A[i];
    }

    for (int i : A) {
      bw.write(i + " ");
    }

    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}