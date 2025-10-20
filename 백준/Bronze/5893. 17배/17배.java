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

    String N = br.readLine();

    BigInteger binaryNum = new BigInteger(N, 2);

    BigInteger result = binaryNum.multiply(BigInteger.valueOf(17));

    String binaryToDecimal = result.toString(2);

    bw.write(binaryToDecimal + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}