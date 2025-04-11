import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Deque<Integer> deque = new ArrayDeque<>();

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String order = st.nextToken();

      if (order.equals("push_front")) {
        deque.offerFirst(Integer.parseInt(st.nextToken()));

      } else if (order.equals("push_back")) {
        deque.offerLast(Integer.parseInt(st.nextToken()));

      } else if (order.equals("pop_front")) {
        if (deque.isEmpty()) {
          bw.write("-1\n");
        } else {
          bw.write(deque.pollFirst() + "\n");
        }
        
      } else if (order.equals("pop_back")) {
        if (deque.isEmpty()) {
          bw.write("-1\n");
        } else {
          bw.write(deque.pollLast() + "\n");
        }

      } else if (order.equals("size")) {
        bw.write(deque.size() + "\n");

      } else if (order.equals("empty")) {
        if (deque.isEmpty()) {
          bw.write("1\n");
        } else {
          bw.write("0\n");
        }
        
      } else if (order.equals("front")) {
        if (deque.isEmpty()) {
          bw.write("-1\n");
        } else {
          bw.write(deque.peekFirst() + "\n");
        }
        
      } else if (order.equals("back")) {
        if (deque.isEmpty()) {
          bw.write("-1\n");
        } else {
          bw.write(deque.peekLast() + "\n");
        }
      }
    }

    bw.flush();
    br.close();
    bw.close();
  }
}
