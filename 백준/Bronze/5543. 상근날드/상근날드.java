import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int cheapBurger = Integer.MAX_VALUE;

    for (int i = 0; i < 3; i++) {
      cheapBurger = Math.min(cheapBurger, Integer.parseInt(br.readLine()));
    }

    int coke = Integer.parseInt(br.readLine());
    int cider = Integer.parseInt(br.readLine());

    bw.write(cheapBurger + Math.min(coke, cider) - 50 + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}