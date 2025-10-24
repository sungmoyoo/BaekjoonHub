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

    int C = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    int bottle = 0;

    for (int i = 1; i <= C; i++) {
      bottle += (K * i) + (P * (int) Math.pow(i, 2));
    }
    
    bw.write(bottle + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}