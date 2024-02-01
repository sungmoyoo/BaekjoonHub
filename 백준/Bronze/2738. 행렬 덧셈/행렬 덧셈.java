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

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    // 2차원 배열 생성
    int arr[][] = new int[N][M];

    // 반복문 3개 사용
    // 1. A,B 각각
    for (int n = 0; n < 2; n++) {
      // 2. N줄의 개수
      for (int i = 0; i < N; i++) {
        st = new StringTokenizer(br.readLine()); // 원소 받기 전 StringTokenizer 객체 생성
        // 3. M 원소 개수
        for (int j = 0; j < M; j++) {
          arr[i][j] += Integer.parseInt(st.nextToken()); // (0,0) ~ (N,M) 값을 할당연산자로 바로 저장
        }
      }
    }

    // 출력
    // 2차원 배열의 원소는 1차원 배열이다. 
    // 반복문으로 원소를 출력한 후 1차원 배열에 담고
    // 다시 반복문으로 원소를 출력하면 결과를 얻을 수 있다.
    //    for (int i = 0; i < arr.length; i++) {
    //      int[] inArr = arr[i];
    //      for (int j = 0; j < inArr.length; j++) {
    //        bw.write(inArr[j] + " ");
    //      }
    //      bw.write("\n");
    //    }

    // foreach 반복문을 사용하면 바로 2차원 배열의 원소를 배열에 담을 수 있어 
    // 더 간단하게 출력할 수 있다.
    for (int[] in : arr) {
      for (int value : in) {
        bw.write(value + " ");
      }
      bw.write("\n");
    }

    bw.close();
    br.close();
  }
}