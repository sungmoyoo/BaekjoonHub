import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    long A = Long.parseLong(st.nextToken());
    long B = Long.parseLong(st.nextToken());
    long C = Long.parseLong(st.nextToken());

    long answer = solution(A, B, C);

    bw.write(answer + "\n");

    bw.flush();
    br.close();
    bw.close();
  }

  static long solution(long a, long b, long c) {
    if (b == 0) return 1;

    long half = solution(a, b / 2, c);
    long result = (half * half) % c;

    if (b % 2 == 1) result = (result * a) % c;

    return result;
  }
}