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
    int[] arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int maxNum = arr[0];
    int currentSum = arr[0];

    for (int i = 1; i < N; i++) {
      currentSum = Math.max(arr[i], currentSum + arr[i]);
      maxNum = Math.max(maxNum, currentSum);
    }

    bw.write(maxNum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}