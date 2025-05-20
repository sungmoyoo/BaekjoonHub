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
    Long A = Long.parseLong(st.nextToken());
    Long B = Long.parseLong(st.nextToken());

    bw.write((A+B) * (A-B) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}