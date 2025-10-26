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

    int A = Integer.parseInt(st.nextToken()) / 2;
    int B = Integer.parseInt(st.nextToken());

    if (A == 0 || B == 0) {
      bw.write("0\n");
    } else {
      bw.write(Math.min(A, B) + "\n");
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}