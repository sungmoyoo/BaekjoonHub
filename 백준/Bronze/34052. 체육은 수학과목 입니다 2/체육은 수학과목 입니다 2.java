import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int time = 0;
    for (int i = 0; i < 4; i++) {
      time += Integer.parseInt(br.readLine());
    }

    if (time + 300 <= 1800) {
      bw.write("Yes\n");
    } else {
      bw.write("No\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}