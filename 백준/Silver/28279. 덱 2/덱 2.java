import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    Deque<Integer> deque = new ArrayDeque<>();

    while (N-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "1":
          deque.offerFirst(Integer.parseInt(st.nextToken()));
          break;
        case "2":
          deque.offerLast(Integer.parseInt(st.nextToken()));
          break;
        case "3":
          bw.write((!deque.isEmpty() ? deque.pollFirst() : -1) + "\n");
          break;
        case "4":
          bw.write((!deque.isEmpty() ? deque.pollLast() : -1) + "\n");
          break;
        case "5":
          bw.write(deque.size() + "\n");
          break;
        case "6":
          bw.write((deque.isEmpty() ? 1 : 0) + "\n");
          break;
        case "7":
          bw.write((!deque.isEmpty() ? deque.peekFirst() : -1) + "\n");
          break;
        case "8":
          bw.write((!deque.isEmpty() ? deque.peekLast() : -1) + "\n");
      }
    }

    br.close();
    bw.flush();
    bw.close();
  }
}