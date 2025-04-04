import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());

    int ABC = A*B*C;
    String[] arr = String.valueOf(ABC).split("");

    int[] countByIndex = new int[10];

    for (String s : arr) {
      int idx = Integer.parseInt(s);
      countByIndex[idx]++;
    }

    for (int result : countByIndex) {
      bw.write(result + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}