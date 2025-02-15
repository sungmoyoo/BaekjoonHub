import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // N과 자료구조 타입, 초기 원소 입력
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Deque<Integer> deque = new ArrayDeque<>();

    int[] types = new int[N];
    for (int i = 0; i < N; i++) {
      types[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int value = Integer.parseInt(st.nextToken());
      if (types[i] == 0) {
        deque.offerFirst(value);
      }
    }

    // M과 삽입할 원소 입력
    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    while (M-- > 0) {
      deque.offerLast(Integer.parseInt(st.nextToken()));
      bw.write(deque.pollFirst() + " ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}