import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int nCount = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] divisors = new int[nCount];

    for (int i = 0; i < nCount; i++) {
      divisors[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(divisors);

    int result = divisors[0] * divisors[nCount-1];

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}