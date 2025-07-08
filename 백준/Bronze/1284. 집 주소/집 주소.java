import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] length = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
    while (true) {
      String address = br.readLine();

      if (Integer.parseInt(address) == 0) {
        break;
      }

      char[] num = address.toCharArray();
      int defaultBlank = num.length - 1 + 2;
      int numlength = 0;

      for (char c : num) {
        int n = Character.getNumericValue(c);
        numlength += length[n];
      }

      bw.write(numlength + defaultBlank + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}