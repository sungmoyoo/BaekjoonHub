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
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    Long[] arr = new Long[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Long.parseLong(st.nextToken());
    }

    long[] remainderCount = new long[M];
    remainderCount[0] = 1;
    long result = 0;
    long sum = 0;

    for (int i = 0; i < N; i++) {
      sum += arr[i];

      int remainder = (int) (sum % M);

      if (remainder < 0) {
        remainder += M;
      }

      result += remainderCount[remainder];

      remainderCount[remainder]++;
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}