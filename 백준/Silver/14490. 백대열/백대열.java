import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] nm = br.readLine().split(":");

    long n = Long.parseLong(nm[0]);
    long m = Long.parseLong(nm[1]);

    long g = gcd(n, m);

    bw.write((n / g) + ":" + (m / g) + "\n");
    
    bw.flush();
    bw.close();
    br.close();
  }

  private static long gcd(long a, long b) {
    while (b != 0) {
      long temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }
}