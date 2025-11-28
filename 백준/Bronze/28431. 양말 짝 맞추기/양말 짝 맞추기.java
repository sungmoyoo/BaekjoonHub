import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] socks = new int[10];
    for (int i = 0; i < 5; i++) {
      int num = Integer.parseInt(br.readLine());
      socks[num]++;
    }

    for (int i = 0; i < socks.length; i++) {
      if (socks[i] % 2 == 1) {
        bw.write(i + "\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}