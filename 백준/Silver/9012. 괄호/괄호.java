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

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {

      char[] s = br.readLine().toCharArray();

      if (is_VPS(s)) {
        bw.write("YES" + "\n");
      } else {
        bw.write("NO" + "\n");
      }


    }

    br.close();
    bw.flush();
    bw.close();
  }

  public static Boolean is_VPS(char[] arr) {
    Stack<Integer> stack = new Stack<>();

    for (char c : arr) {
      if (c == '(') {
        stack.push(1);
      } else  {
        if (stack.empty()) {
          return false;
        }
        stack.pop();
      }
    }

    return stack.empty();
  }
}