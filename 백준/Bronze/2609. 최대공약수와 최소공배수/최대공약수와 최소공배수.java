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
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    
    bw.write(getDivisor(A, B) + "\n");
    bw.write(getMultiple(A, B) + "\n");

    bw.flush();
    br.close();
    bw.close();
  }

  private static int getDivisor(int a, int b) {
    while (b != 0) {
      int temp = a;
      a = b;
      b = temp % b;
    }
    return a;
  }

  private static int getMultiple(int a, int b) {
    return (a * b) / getDivisor(a, b);
  }
}
