import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N  = Integer.parseInt(br.readLine());

    int sum = 0;
    for (int i = 0; i < N; i++) {
       sum += Integer.parseInt(br.readLine())-1;
    }

    sum += 1;

    bw.write(sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}