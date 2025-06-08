import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    BigInteger A = new BigInteger(br.readLine());
    String operator = br.readLine();
    BigInteger B = new BigInteger(br.readLine());

    if (operator.equals("+")) {
      bw.write(A.add(B) + "\n");
    } else {
      bw.write(A.multiply(B) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}