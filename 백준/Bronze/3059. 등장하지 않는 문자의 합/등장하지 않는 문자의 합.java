import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0) {
      List<Integer> list = new LinkedList<>();

      for (int i = 65; i <= 90; i++) {
        list.add(i);
      }

      char[] S = br.readLine().toCharArray();

      for (char c : S) {
        if (list.contains((int) c)) {
          list.remove((Integer) (int) c);
        }
      }

      int sum = 0;
      for (int i : list) {
        sum += i;
      }
      bw.write(sum + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}