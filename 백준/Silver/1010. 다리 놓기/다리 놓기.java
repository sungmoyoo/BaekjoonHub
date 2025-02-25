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
    
    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      long answer = getBinomialCoefficient(M, N);

      bw.write(answer + "\n");
    }


    bw.flush();
    br.close();
    bw.close();
  }
  // 기존 팩토리얼로 이항계수를 계산하면 오버플로우가 발생
  // 팩토리얼을 계산하지 않고 M! 에서 N!을 나누면서 계산
  public static long getBinomialCoefficient(int M, int N) {
    // C(M, N) == C(M, M-N) 활용 => 더 적은 연산 수행 위해 최적화
    if (N > M - N) {
      N = M - N;
    }

    long result = 1;
    for (int i = 0; i < N; i++) {
      result *= (M - i);
      result /= (i + 1);
    }
    return result;
  }
}


