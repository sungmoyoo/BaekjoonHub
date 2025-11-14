import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    List<Float> temperature = new ArrayList<>();
    float n;
    while ((n = Float.parseFloat(br.readLine())) != 999) {
      temperature.add(n);
    }

    for (int i = 0; i < temperature.size() - 1; i++) {
      System.out.printf("%.2f\n", temperature.get(i + 1) - temperature.get(i));
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}