import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    List<Integer> list = new ArrayList<>();

    int idx = 1;
    list.add(idx);
    while (idx++ <= 50) {
      for (int i = 0; i < idx; i++) {
        list.add(idx);
      }
    }

    int result = 0;
    for (int i = A; i <= B; i++) {
      result += list.get(i-1);
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}