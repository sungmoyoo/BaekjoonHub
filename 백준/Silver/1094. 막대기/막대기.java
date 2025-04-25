import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int X = Integer.parseInt(br.readLine());
    List<Integer> sticks = new ArrayList<>();
    sticks.add(64);
    int sum = 64;

    while (sum > X) {
      int shortest = sticks.remove(sticks.size() - 1);
      int half = shortest / 2;
      
      sticks.add(half);
      sum = sum - shortest + half;
      
      if (sum >= X) {
        continue;
      }
      
      sticks.add(half);
      sum += half;
    }

    bw.write(sticks.size() + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
