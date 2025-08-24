import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int m = Integer.parseInt(br.readLine());

    long val = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int n = Integer.parseInt(st.nextToken());
      val = val * A + n;
    }

    ArrayList<Integer> result = new ArrayList<>();
    while (val > 0) {
      result.add((int)(val % B));
      val /= B;
    }
    Collections.reverse(result);

    for (int i = 0; i < result.size(); i++) {
      bw.write(result.get(i) + (i == result.size() - 1 ? "" : " "));
    }
    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}