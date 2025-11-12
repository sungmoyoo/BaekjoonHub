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
    int e = Integer.parseInt(st.nextToken());
    int f = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int bottle = e + f;
    int count = 0;

    while (bottle >= c) {
      count += bottle / c;
      bottle = bottle % c + bottle / c;
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}