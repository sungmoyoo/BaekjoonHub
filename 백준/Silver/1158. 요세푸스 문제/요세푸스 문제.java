import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Deque<Integer> deque = new ArrayDeque<>();
    List<Integer> resultList = new ArrayList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= N; i++) {
      deque.offerLast(i);
    }

    int count = 1;
    while (!deque.isEmpty()) {
      if (count == K) {
        resultList.add(deque.pollFirst());
        count = 1;
      } else {
        deque.offerLast(deque.pollFirst());
        count++;
      }
    }

    bw.write("<");

    for (int i = 1; i <= resultList.size(); i++) {
      bw.write(String.valueOf(resultList.get(i-1)));

      if (i != resultList.size()) {
        bw.write(", ");
      }
    }

    bw.write(">");

    bw.flush();
    bw.close();
    br.close();
  }
}
