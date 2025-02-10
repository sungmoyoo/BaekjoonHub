import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    Queue<Integer> queue = new LinkedList<>();
    int last_num = -1;

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String command = st.nextToken();

      if (command.equals("push")) {
        last_num = Integer.parseInt(st.nextToken());
        queue.offer(last_num);

      } else if (command.equals("pop")) {
        bw.write((queue.isEmpty() ? -1 : queue.poll()) + "\n");

      } else if (command.equals("size")) {
        bw.write(queue.size() + "\n");

      } else if (command.equals("empty")) {
        bw.write((queue.isEmpty() ? 1 : 0) + "\n");

      } else if (command.equals("front")) {
          bw.write((queue.isEmpty() ? -1 : queue.peek()) + "\n");

      } else if (command.equals("back")) {
        bw.write((queue.isEmpty() ? -1 : last_num) + "\n");

      }
    }

    br.close();
    bw.flush();
    bw.close();
  }
}