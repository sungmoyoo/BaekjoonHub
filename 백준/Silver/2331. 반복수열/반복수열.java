import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    List<Integer> list = new LinkedList<>();

    int A = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    list.add(A);

    int repeatIdx = 0;

    while (true) {
      int sum = 0;

      while (A > 0) {
        int digit = A % 10;
        sum += (int) Math.pow(digit, P);
        A /= 10;
      }

      A = sum;

      if (list.contains(sum)) {
        repeatIdx = list.indexOf(sum);
        break;
      }

      list.add(sum);

    }

    list.subList(repeatIdx, list.size()).clear();

    bw.write(list.size() + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}