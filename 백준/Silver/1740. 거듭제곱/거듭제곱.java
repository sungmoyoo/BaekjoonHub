import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long N = Long.parseLong(br.readLine());

    String binary = Long.toBinaryString(N);
    BigInteger result = BigInteger.ZERO;
    BigInteger base = BigInteger.valueOf(3);

    int size = binary.length();
    for (int i = 0; i < size; i++) {
      if (binary.charAt(i) == '1') {
        result = result.add(base.pow(size - 1 - i));
      }
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}