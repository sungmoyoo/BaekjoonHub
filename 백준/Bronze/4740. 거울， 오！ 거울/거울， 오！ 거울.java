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
    while (true) {
      String word = br.readLine();
      if (word.equals("***")) {
        break;
      }
      
      for (int i = word.length() - 1; i >= 0; i--) {
        sb.append(word.charAt(i));
      }
      sb.append("\n");
    }

    bw.write(sb + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}