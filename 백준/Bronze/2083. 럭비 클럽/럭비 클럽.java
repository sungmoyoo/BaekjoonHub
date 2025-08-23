import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input;

    while (!(input = br.readLine()).equals("# 0 0")) {
      String[] info = input.split(" ");
      int age = Integer.parseInt(info[1]);
      int weight = Integer.parseInt(info[2]);

      if (age > 17 || weight >= 80) {
        bw.write(info[0] + " Senior\n");
      } else {
        bw.write(info[0] + " Junior\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}