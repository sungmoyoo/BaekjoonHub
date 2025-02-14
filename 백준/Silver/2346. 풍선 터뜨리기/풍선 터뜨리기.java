import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Deque<int[]> deque = new ArrayDeque<>();

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 1; i <= N; i++) {
      deque.offer(new int[]{i, Integer.parseInt(st.nextToken())});
    }

    while (!deque.isEmpty()) {
      int[] current = deque.pollFirst();
      bw.write(current[0] + " ");

      if (deque.isEmpty()) {
        break;
      }

      int move = current[1];

      if (move < 0) {
        for (int i = 0; i < Math.abs(move); i++) {
          deque.offerFirst(deque.pollLast());
        }
      } else {
        for (int i = 1; i < move; i++) {
          deque.offerLast(deque.pollFirst());
        }
      }
    }

    br.close();
    bw.flush();
    bw.close();
  }
}