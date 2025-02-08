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

    String str;
    while (!(str = br.readLine()).equals(".")) {
      char[] arr = str.toCharArray();

      if (is_VPS(arr)) {
        bw.write("yes" + "\n");
      } else {
        bw.write("no" + "\n");
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

      } else if (c == ')') {
        if (stack.empty() ||  stack.peek() == 2) {
          return false;
        }
        stack.pop();

      } else if (c == '[') {
        stack.push(2);

      } else if (c == ']') {
        if (stack.empty() || stack.peek() == 1) {
          return false;
        }
        stack.pop();

      }
    }

    return stack.empty();
  }
}