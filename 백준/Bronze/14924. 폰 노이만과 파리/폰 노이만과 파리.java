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

    int S = Integer.parseInt(st.nextToken());
    int T = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());

    int result = (D/(S*2)) * T;

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}