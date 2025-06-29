import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    while (true) {
      String code = br.readLine();
      if (code.equals("END")) {
        break;
      }
      bw.write(decode(code) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }

  private static String decode (String code) {
    char[] arr = code.toCharArray();

    StringBuilder sb = new StringBuilder();
    for (int i = arr.length-1; i >= 0; i--) {
      sb.append(arr[i]);
    }

    return sb.toString();
  }
}