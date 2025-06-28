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
    int ax = Integer.parseInt(st.nextToken());
    int ay = Integer.parseInt(st.nextToken());
    int az = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int cx = Integer.parseInt(st.nextToken());
    int cy = Integer.parseInt(st.nextToken());
    int cz = Integer.parseInt(st.nextToken());

    int bx = cx - az;
    int by = cy / ay;
    int bz = cz - ax;

    bw.write(bx + " " + by + " " + bz);

    bw.flush();
    bw.close();
    br.close();
  }
}