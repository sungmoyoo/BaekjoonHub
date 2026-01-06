import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    while (N-- > 0) {
      String input = br.readLine();

      if (input.charAt(0) == 'P') {
        bw.write("skipped\n");
      } else {
        String[] num = input.split("\\+");

        int sum = 0;
        for (String n : num) {
          sum += Integer.parseInt(n);
        }

        bw.write(sum + "\n");
      }
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}