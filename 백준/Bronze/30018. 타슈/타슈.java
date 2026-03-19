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
    int[] a = new int[N];
    int[] b = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      b[i] = Integer.parseInt(st.nextToken());
    }

    int count = 0;
    for (int i = 0; i < N; i++) {
      if (b[i] > a[i]) {
        count += b[i] - a[i];
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}