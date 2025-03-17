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

    int[] arr = new int[N];

    st = new StringTokenizer(br.readLine());
    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += Integer.parseInt(st.nextToken());
      arr[i] = sum;
    }
    
    for (int x = 0; x < M; x++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());

      if (i == 1) {
        bw.write(arr[j-1] + "\n");
      } else {
        bw.write(arr[j - 1] - arr[i - 2] + "\n");
      }
    }
    bw.flush();
    bw.close();
    br.close();
  }
}