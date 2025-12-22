import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int S = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    long result = 1;
    int r = S % K;
    for (int i = 0; i < K; i++) {
      if (r > 0) {
        result *= S / K + 1;
        r--;
      } else {
        result *= S / K;
      }
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}