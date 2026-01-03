import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int[] firstDog;
  static int[] secondDog;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());

    firstDog = new int[A+B];
    secondDog = new int[C+D];

    for (int i = 0; i < A; i++) {
      firstDog[i]++;
    }
    for (int i = 0; i < C; i++) {
      secondDog[i]++;
    }

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < 3; i++) {
      int n = Integer.parseInt(st.nextToken());
      bw.write(counting(n) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }

  private static int counting(int T) {
    int pos1 = (T-1) % firstDog.length;
    int pos2 = (T-1) % secondDog.length;

    return firstDog[pos1] + secondDog[pos2];
  }
}