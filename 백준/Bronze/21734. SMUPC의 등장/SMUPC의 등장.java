import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] arr = br.readLine().toCharArray();

    StringBuilder sb = new StringBuilder();
    for (char c : arr) {
      String ascii = String.valueOf((int) c);

      int n = 0;
      for (int i = 0; i < ascii.length(); i++) {
        n += Character.getNumericValue(ascii.charAt(i));
      }

      while (n-- > 0) {
        sb.append(c);
      }
      sb.append("\n");
    }

    bw.write(sb + "\n");


    bw.flush();
    bw.close();
    br.close();
  }
}