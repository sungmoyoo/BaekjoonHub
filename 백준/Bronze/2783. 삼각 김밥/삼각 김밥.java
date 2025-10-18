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
    double sevenX = Double.parseDouble(st.nextToken());
    double sevenY = Double.parseDouble(st.nextToken());

    double minPrice = sevenX * (1000/sevenY);

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0) {
      st = new StringTokenizer(br.readLine());
      double X = Double.parseDouble(st.nextToken());
      double Y = Double.parseDouble(st.nextToken());

      double price = X * (1000/Y);

      minPrice = Math.min(minPrice, price);

    }

    System.out.printf("%.2f", minPrice);

    bw.flush();
    bw.close();
    br.close();
  }
}