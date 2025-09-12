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
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    LinkedList<Integer> basket = new LinkedList<>();
    for (int i = 1; i <= N; i++) {
      basket.add(i);
    }

    for (int m = 0; m < M; m++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken()) - 1;
      int j = Integer.parseInt(st.nextToken()) - 1;
      int k = Integer.parseInt(st.nextToken()) - 1;

      List<Integer> sub = new ArrayList<>(basket.subList(i, j + 1));
      List<Integer> rotated = new ArrayList<>();

      rotated.addAll(sub.subList(k - i, sub.size()));
      rotated.addAll(sub.subList(0, k - i));

      for (int t = 0; t <= j - i; t++) {
        basket.remove(i);
      }

      for (int t = 0; t < rotated.size(); t++) {
        basket.add(i + t, rotated.get(t));
      }
    }

    for (int x : basket) {
      bw.write(x + " ");
    }
    bw.write("\n");

    bw.flush();
    bw.close();
    br.close();
  }
}