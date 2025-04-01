import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    PriorityQueue<Integer> absHeap = new PriorityQueue<>((o1, o2) -> {
      // 절댓값이 같은 경우 작은 숫자부터
      if (Math.abs(o1) == Math.abs(o2)) {
        return o1 - o2;
      }
      return Math.abs(o1) - Math.abs(o2);
    });

    int N = Integer.parseInt(br.readLine());


    for (int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());

      if (x != 0) {
        absHeap.offer(x);
      } else {
        if (absHeap.isEmpty()) {
          bw.write(0 + "\n");
        } else {
          bw.write(absHeap.poll() + "\n");
        }
      }
    }

    bw.flush();
    br.close();
    bw.close();
  }
}