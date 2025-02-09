import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Queue<Integer> line = new LinkedList<>();

    for (int i = 0; i < N; i++) {
      line.offer(Integer.parseInt(st.nextToken()));
    }

    bw.write(is_Nice(line) ? "Nice\n" : "Sad\n" );
    
    br.close();
    bw.flush();
    bw.close();
  }

  public static boolean is_Nice(Queue<Integer> queue) {
    int count = 1;

    Stack<Integer> side = new Stack<>();
      // 앞줄부터 한명씩 판단
      while (!queue.isEmpty()) {
        int current = queue.poll();

        // 일치하면 통과
        if (current == count) {
          count++;

        // 아니면 사이드에 저장
        } else {
          side.push(current);
        }

        // 사이드에 사람이 있고 순번이 일치하면 통과시킴
        while (!side.empty() && side.peek() == count) {
          count++;
          side.pop();
        }
      }




    return side.empty();
  }
}