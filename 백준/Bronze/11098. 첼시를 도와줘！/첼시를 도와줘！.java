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
    
    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      int p = Integer.parseInt(br.readLine());
      
      int maxPrice = Integer.MIN_VALUE;
      String maxName = null;
      
      for (int i = 0; i < p; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int price = Integer.parseInt(st.nextToken());
        String name = st.nextToken();

        if (price > maxPrice) {
          maxPrice = price;
          maxName = name;
        }
      }
      
      bw.write(maxName + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}