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

    for (char c : word) {
      if (c >= 'a' && c <= 'z') {
        bw.write(String.valueOf(c).toUpperCase());
      } else if (c >= 'A' && c <= 'Z') {
        bw.write(String.valueOf(c).toLowerCase());
      }
    }
    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}
