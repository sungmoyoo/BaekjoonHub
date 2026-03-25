import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    
    for (int i = 1; i <= Math.min(a, b); i++) {
      if (a % i == 0 && b % i ==0) {
        bw.write(i + " " + a/i + " " + b/i + "\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}