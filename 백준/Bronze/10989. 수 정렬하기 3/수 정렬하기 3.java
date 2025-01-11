import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 배열 크기 입력
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];

    // 입력 데이터와 최대값 계산
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, arr[i]);
    }

    // 카운팅 배열 생성
    int[] counting_arr = new int[max + 1];

    // 카운팅 배열 업데이트
    for (int num : arr) {
      counting_arr[num]++;
    }

    // 정렬된 결과 출력
    for (int i = 0; i < counting_arr.length; i++) {
      while (counting_arr[i] > 0) {
        bw.write((i) + "\n");
        counting_arr[i]--;
      }
    }

    bw.flush();
    br.close();
    bw.close();
  }
}