import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());

    List<Integer> burger = new LinkedList<>();
    List<Integer> side = new LinkedList<>();
    List<Integer> drink = new LinkedList<>();

    int beforeDiscount = 0;
    int afterDiscount = 0;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < B; i++) {
      burger.add(Integer.parseInt(st.nextToken()));
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < C; i++) {
      side.add(Integer.parseInt(st.nextToken()));
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < D; i++) {
      drink.add(Integer.parseInt(st.nextToken()));
    }

    burger.sort(Comparator.reverseOrder());
    side.sort(Comparator.reverseOrder());
    drink.sort(Comparator.reverseOrder());

    int set = Math.min(B, Math.min(C, D));
    int idx = 0;
    for (int i = 0; i < set; i++) {
      beforeDiscount += burger.get(i) + side.get(i) + drink.get(i);
      afterDiscount += (int) (burger.get(i) * 0.9 + side.get(i) * 0.9 + drink.get(i) * 0.9);
      idx++;
    }

    if (B > idx) {
      for (int i = idx; i < B; i++) {
        beforeDiscount += burger.get(i);
        afterDiscount += burger.get(i);
      }
    }

    if (C > idx) {
      for (int i = idx; i < C; i++) {
        beforeDiscount += side.get(i);
        afterDiscount += side.get(i);
      }
    }

    if (D > idx) {
      for (int i = idx; i < D; i++) {
        beforeDiscount += drink.get(i);
        afterDiscount += drink.get(i);
      }
    }

    bw.write(beforeDiscount + "\n");
    bw.write(afterDiscount + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}