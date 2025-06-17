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

    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

    List<Integer> squareNumber = new ArrayList<>();

    for (int i = 1; i <= 100; i++) {
      squareNumber.add((int) Math.pow(i, 2));
    }

    List<Integer> results = new ArrayList<>();

    for (int i = M; i <= N; i++) {
      if (squareNumber.contains(i)) {
        results.add(i);
      }
    }

    if (results.isEmpty()) {
      bw.write(-1 + "\n");
    } else {
      int sum = results.stream().mapToInt(Integer::intValue).sum();
      int min = results.get(0);

      bw.write(sum + "\n");
      bw.write(min + "\n");
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}