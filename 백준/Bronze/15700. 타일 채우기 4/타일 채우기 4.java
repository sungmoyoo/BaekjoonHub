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
    long N = Integer.parseInt(st.nextToken());
    long M = Integer.parseInt(st.nextToken());

    long result = N * M / 2;

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}