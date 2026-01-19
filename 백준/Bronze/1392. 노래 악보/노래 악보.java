import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int Q = Integer.parseInt(st.nextToken());

    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= N; i++) {
      int sec = Integer.parseInt(br.readLine());

      for (int j = 0; j < sec; j++) {
        list.add(i);
      }
    }

    for (int i = 0; i < Q; i++) {
      int q = Integer.parseInt(br.readLine());
      bw.write(list.get(q) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}