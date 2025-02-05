import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();

    while (N-- > 0) {
      st = new StringTokenizer(br.readLine());
      int command = Integer.parseInt(st.nextToken());

      switch (command) {
        case 1:
          int X = Integer.parseInt(st.nextToken());
          stack.push(X);
          break;

        case 2:
          bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
          break;

        case 3:
          bw.write(stack.size() + "\n");
          break;

        case 4:
          bw.write((stack.isEmpty() ? 1 : 0) + "\n");
          break;

        case 5:
          bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
          break;
      }
    }

    br.close();
    bw.flush();
    bw.close();
  }
}