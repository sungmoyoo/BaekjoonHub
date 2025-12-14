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

    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while (T-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      Double n = Double.parseDouble(st.nextToken());
      String unit = st.nextToken();
      String result;

      if (unit.equals("kg")) {
        result = String.format("%.4f", n * 2.2046);
        sb.append(result).append(" lb\n");

      } else if (unit.equals("lb")) {
        result = String.format("%.4f", n * 0.4536);
        sb.append(result).append(" kg\n");

      } else if (unit.equals("l")) {
        result = String.format("%.4f", n * 0.2642);
        sb.append(result).append(" g\n");

      } else if (unit.equals("g")) {
        result = String.format("%.4f", n * 3.7854);
        sb.append(result).append(" l\n");
      }
    }

    bw.write(sb + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}