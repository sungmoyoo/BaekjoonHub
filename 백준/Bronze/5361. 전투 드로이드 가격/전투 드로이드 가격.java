import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    double[] price = {350.34, 230.90, 190.55, 125.30, 180.90};

    while (T-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      double result = 0;

      for (int i = 0; i < 5; i++) {
        result += Integer.parseInt(st.nextToken()) * price[i];
      }
      System.out.printf("$%.2f\n",result);
    }

    br.close();
  }
}