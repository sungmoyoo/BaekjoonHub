import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int D = Integer.parseInt(br.readLine());

    int P = Integer.parseInt(br.readLine());

    int X = A * P;
    int Y = B;
    if (P > C) {
      Y += (P - C) * D;
    }

    bw.write(Math.min(X, Y) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}