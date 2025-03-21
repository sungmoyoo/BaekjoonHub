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
    int[] coinValue = new int[N];

    for (int i = 0; i < N; i++) {
      coinValue[i] = Integer.parseInt(br.readLine());
    }

    int remainValue = K;
    int currentIndex = N-1;
    int count = 0;
    while (remainValue != 0) {
      if (remainValue >= coinValue[currentIndex]) {
        count += remainValue / coinValue[currentIndex];
        remainValue %= coinValue[currentIndex];
      } else {
        currentIndex--;
      }
    }

    bw.write(count + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}