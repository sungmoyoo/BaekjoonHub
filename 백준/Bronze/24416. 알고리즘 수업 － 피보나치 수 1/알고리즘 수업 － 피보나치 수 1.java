import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int maxN = 40;
  static int[] f = new int[maxN+1];
  static int codeOneCount = 0;
  static int codeTwoCount = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    fib(N);
    fibonacci(N);
    bw.write(codeOneCount + " " + codeTwoCount + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  static int fib(int n) {
    if (n == 1 || n == 2) {
      codeOneCount++;
      return 1;
    }
    else {
      return fib(n-1) + fib(n-2);
    }
  }

  static int fibonacci(int n) {
    f[1] = 1;
    f[2] = 1;

    for (int i = 3; i <= n; i++) {
      codeTwoCount++;
      f[i] = f[i-1] + f[i-2];
    }

    return f[n];
  }
}