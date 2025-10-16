import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] n = br.readLine().split("");

    int sum = 0;
    for (String num : n) {
      sum += (int) Math.pow(Integer.parseInt(num), 5);
    }

    bw.write(sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}