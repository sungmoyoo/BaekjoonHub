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
    int K = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    int[] sumArr = new int[N-K+1];
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;


    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      sum += Integer.parseInt(st.nextToken());
      arr[i] = sum;
    }

    int idx1 = K;
    int idx2 = 0;
    for (int i = 0; i < sumArr.length; i++) {
      if (i == 0) {
        sumArr[i] = arr[idx1-1];
      } else {
        sumArr[i] = arr[idx1++] - arr[idx2++];
      }
      maxSum = Math.max(maxSum, sumArr[i]);
    }

    bw.write(maxSum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}