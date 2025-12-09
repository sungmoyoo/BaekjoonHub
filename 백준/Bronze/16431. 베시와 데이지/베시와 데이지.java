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
    int Br = Integer.parseInt(st.nextToken());
    int Bc = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int Dr = Integer.parseInt(st.nextToken());
    int Dc = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int Jr = Integer.parseInt(st.nextToken());
    int Jc = Integer.parseInt(st.nextToken());

    int bessieSec = Math.abs(Jr - Br) + Math.abs(Jc - Bc);
    int daisySec = Math.abs(Jr - Dr) + Math.abs(Jc - Dc);

    if (Math.abs(Jr - Br) > 0 && Math.abs(Jc - Bc) > 0) {
      bessieSec = bessieSec - Math.min(Math.abs(Jr - Br), Math.abs(Jc - Bc));
    }

    if (bessieSec > daisySec) {
      bw.write("daisy\n");
    } else if (bessieSec < daisySec) {
      bw.write("bessie\n");
    } else {
      bw.write("tie\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}