import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static class Document {
    int priority;
    int index;

    public Document(int priority, int index) {
      this.priority = priority;
      this.index = index;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      Queue<Document> queue = new LinkedList<>();
      st = new StringTokenizer(br.readLine());

      for (int i = 0; i < N; i++) {
        int priority = Integer.parseInt(st.nextToken());
        queue.offer(new Document(priority, i));
      }

      int count = 0;
      while (!queue.isEmpty()) {
        Document current = queue.poll();
        boolean isMax = true;

        for (Document doc : queue) {
          if (doc.priority > current.priority) {
            isMax = false;
            break;
          }
        }

        if (isMax) {
          count++;
          if (current.index == M) {
            break;
          }
        } else {
          queue.offer(current);
        }
      }

      bw.write(count + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}