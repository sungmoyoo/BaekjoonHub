import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    char[] word = br.readLine().toCharArray();

    StringBuilder sb = new StringBuilder();

    for (char c : word) {
      if (c != 'C' &&
          c != 'A' &&
          c != 'M' &&
          c != 'B' &&
          c != 'R' &&
          c != 'I' &&
          c != 'D' &&
          c != 'G' &&
          c != 'E') {
        sb.append(c);
      }
    }

    bw.write(sb + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}