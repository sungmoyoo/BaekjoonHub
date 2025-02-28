import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int callCount = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      String str = br.readLine();
      bw.write(isPalindrome(str.toCharArray()) + " " + callCount + "\n");
      callCount = 0;
    }

    bw.flush();
    br.close();
    bw.close();
  }

  public static int recursion(char[] s, int l, int r) {
    callCount++;
    if (l >= r) return 1;
    else if (s[l] != s[r]) return 0;
    else return recursion(s, l+1, r-1);
  }

  public static int isPalindrome(char[] s) {
    return recursion(s, 0, s.length-1);
  }
}


