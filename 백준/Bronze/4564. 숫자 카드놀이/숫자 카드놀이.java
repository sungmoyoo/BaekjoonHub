import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String s;

    while (!(s = br.readLine()).equals("0")) {
      while (true) {
        int mul = 1;
        bw.write(s + " ");

        if (Integer.parseInt(s) < 10) {
          break;
        }
        char[] arr = s.toCharArray();

        for (char c : arr) {
          mul *= Character.getNumericValue(c);
        }

        s = String.valueOf(mul);
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}