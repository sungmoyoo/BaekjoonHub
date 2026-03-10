import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long N = Long.parseLong(br.readLine());

    if (N <= 100000 && N % 2024 == 0) {
      bw.write("Yes\n");
    } else {
      bw.write("No\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}