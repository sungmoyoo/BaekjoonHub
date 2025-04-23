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
    int station = 4;
    int result = 0;
    int passenger = 0;

    while (station-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      passenger -= Integer.parseInt(st.nextToken());
      passenger += Integer.parseInt(st.nextToken());

      result = Math.max(result, passenger);
    }

    bw.write(result + "\n");
    
    bw.flush();
    br.close();
    bw.close();
  }
}
