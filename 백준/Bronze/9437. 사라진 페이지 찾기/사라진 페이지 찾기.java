import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N;
    int P;


    while (true) {
      N = sc.nextInt();

      List<Integer> list = new ArrayList<>();
      if (N == 0) break;

      P = sc.nextInt();
      int pair = Math.min(P, N - P + 1);
      int groupNum = (pair - 1) / 2;

      int a = groupNum * 2 + 1;
      int b = groupNum * 2 + 2;
      int c = N - a + 1;
      int d = N - b + 1;

      list.add(a);
      list.add(b);
      list.add(c);
      list.add(d);

      Collections.sort(list);

      for (int n : list) {
        if (n != P) {
          bw.write(n + " ");
        }
      }
      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}