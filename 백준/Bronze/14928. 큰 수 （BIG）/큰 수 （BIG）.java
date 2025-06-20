import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String N = br.readLine();

    int MOD = 20000303;
    int result = 0;

    for (int i = 0; i < N.length(); i++) {
      int digit = N.charAt(i) - '0';
      result = (int)(((long)result * 10 + digit) % MOD);
    }

    System.out.println(result);

    bw.flush();
    bw.close();
    br.close();
  }
}