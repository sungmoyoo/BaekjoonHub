import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Deque<Integer> deque = new ArrayDeque<>();

    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N; i++) {
      deque.offerLast(i);
    }

    while (deque.size() > 1) {
      bw.write(deque.pollFirst() + " ");
      deque.offerLast(deque.pollFirst());
    }

    bw.write(deque.peek() + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}