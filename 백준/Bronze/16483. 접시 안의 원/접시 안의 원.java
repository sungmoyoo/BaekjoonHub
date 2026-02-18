import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    double T = Double.parseDouble(br.readLine());

    double result = T * T / 4.0;

    bw.write(Math.round(result) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}