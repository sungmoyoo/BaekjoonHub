import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int K = Integer.parseInt(br.readLine());
    char[] password = br.readLine().toCharArray();

    StringBuilder decoded = new StringBuilder();
    int idx = 0;
    for (int i = 0; i < password.length; i++) {
      if (i == idx) {
        decoded.append(password[i]);
        idx += K;
      }
    }

    bw.write(decoded + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}