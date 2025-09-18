import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();

    switch (input) {
      case "SONGDO":
        bw.write("HIGHSCHOOL\n");
        break;
      case "CODE":
        bw.write("MASTER\n");
        break;
      case "2023":
        bw.write("0611\n");
        break;
      case "ALGORITHM":
        bw.write("CONTEST\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}