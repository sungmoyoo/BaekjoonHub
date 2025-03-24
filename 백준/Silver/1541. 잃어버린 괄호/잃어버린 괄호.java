import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] arr = br.readLine().split("-");

    int result = sumExecution(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      result -= sumExecution(arr[i]);
    }

    bw.write(result + "\n");

    bw.flush();
    br.close();
    bw.close();
  }

  static int sumExecution(String s) {
    String[] nums = s.split("\\+");
    int total = 0;

    for (String num : nums) {
      if (!num.isEmpty()) {
        total += Integer.parseInt(num);
      }
    }
    return total;
  }
}