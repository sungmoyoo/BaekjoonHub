import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      double price = Double.parseDouble(br.readLine());
      double discounted = price - price * 0.2;

      System.out.printf("$%.2f\n", discounted);
    }

    br.close();
  }
}