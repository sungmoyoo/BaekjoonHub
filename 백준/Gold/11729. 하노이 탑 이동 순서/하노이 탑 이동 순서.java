import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    int count = (int) Math.pow(2, N) - 1;
    sb.append(count).append("\n");

    move(N, 1, 3, 2);

    bw.write(new String(sb));

    bw.flush();
    bw.close();
    br.close();
  }
  // n이 두 개 이상이면
  public static void move(int n, int start, int end, int sub) {
    // n이 1일 때, 한번 옮기고 종료
    if (n <= 1) {
      sb.append(start).append(" ").append(end).append("\n");
      return;
    }

    // n-1개의 원판을 시작기둥에서 보조기둥으로 옮기는 재귀
    move(n-1, start, sub, end);

    sb.append(start).append(" ").append(end).append("\n");

    // n-1개의 원판을 보조기둥에서 도착기둥으로 옮기는 재귀
    move(n-1, sub, end, start);
  }
}


