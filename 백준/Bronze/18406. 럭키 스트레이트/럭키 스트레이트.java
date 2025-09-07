import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] point = br.readLine().split("");

    int pointSumLeft = 0;
    for (int i = 0; i < point.length/2; i++) {
      pointSumLeft += Integer.parseInt(point[i]);
    }

    int pointSumRight = 0;
    for (int i = point.length/2; i < point.length; i++) {
      pointSumRight += Integer.parseInt(point[i]);
    }

    if (pointSumLeft == pointSumRight) {
      bw.write("LUCKY\n");
    } else {
      bw.write("READY\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}