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
    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());

    int[] block = new int[W];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < W; i++) {
      block[i] = Integer.parseInt(st.nextToken());
    }

    int[] leftMax = new int[W];
    int[] rightMax = new int[W];

    leftMax[0] = block[0];
    for (int i = 1; i < W; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], block[i]);
    }

    rightMax[W - 1] = block[W - 1];
    for (int i = W - 2; i >= 0; i--) {
      rightMax[i] = Math.max(rightMax[i + 1], block[i]);
    }

    int water = 0;
    for (int i = 0; i < W; i++) {
      water += Math.max(0, Math.min(leftMax[i], rightMax[i]) - block[i]);
    }

    bw.write(water + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}