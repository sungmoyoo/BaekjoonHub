import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int K = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < K; i++) {
      int N = Integer.parseInt(br.readLine());

      if (N != 0) {
        stack.push(N);
      } else {
        stack.pop();
      }
    }

    int total_sum = 0;

    while (!stack.empty()) {
      total_sum += stack.pop();
    }

    bw.write(total_sum + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}