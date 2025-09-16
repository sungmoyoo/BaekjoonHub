import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int sum = N * (N + 1) / 2;
    int squared = sum * sum;
    int cubeSum = 0;

    for (int i = 1; i <= N; i++) {
      cubeSum += i * i * i;
    }

    bw.write(sum + "\n");
    bw.write(squared + "\n");
    bw.write(cubeSum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}