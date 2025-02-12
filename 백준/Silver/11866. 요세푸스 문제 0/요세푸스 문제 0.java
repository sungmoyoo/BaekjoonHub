import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);


    Queue<Integer> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= N; i++) {
      queue.offer(i);
    }

    int count = 1;
    while (!queue.isEmpty()) {
      if (count != K) {
        queue.offer(queue.poll());
        count++;
      } else {
        list.add(queue.poll());
        count = 1;
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < list.size(); i++) {
      sb.append(list.get(i));
      if (i < list.size() - 1) {
        sb.append(", ");
      }
    }

    bw.write("<" + sb + ">");

    br.close();
    bw.flush();
    bw.close();
  }
}