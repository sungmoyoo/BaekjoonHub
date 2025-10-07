import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] W = new int[10];
    int[] K = new int[10];

    for (int i = 0; i < 10; i++) {
      W[i] = Integer.parseInt(br.readLine());
    }
    for (int i = 0; i < 10; i++) {
      K[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(W);
    Arrays.sort(K);

    int resultW = 0;
    int resultK = 0;

    for (int i = 9; i > 6; i--) {
      resultW += W[i];
      resultK += K[i];
    }

    bw.write(resultW + " " + resultK + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}