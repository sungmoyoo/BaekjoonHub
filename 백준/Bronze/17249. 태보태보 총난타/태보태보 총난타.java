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

    boolean isLeft = true;
    int left = 0;
    int right = 0;

    for (char c : arr) {
      if (c == '0') {
        isLeft = false;
      }

      if (c == '@') {
        if (isLeft) {
          left++;
        } else {
          right++;
        }
      }
    }

    bw.write(left + " " + right + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}