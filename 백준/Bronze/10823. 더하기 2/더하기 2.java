import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();
    String input;
    while ((input = br.readLine()) != null && !input.isEmpty()) {
      sb.append(input);
    }

    long sum = 0;
    String[] nums = sb.toString().split(",");

    for (String num : nums) {
      sum += Integer.parseInt(num);
    }

    bw.write(sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}