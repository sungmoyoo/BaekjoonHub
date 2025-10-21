import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    if (n >= 620 && n <= 780) {
      bw.write("Red\n");
    } else if (n >= 590 && n < 620) {
      bw.write("Orange\n");
    } else if (n >= 570 && n < 590) {
      bw.write("Yellow\n");
    } else if (n >= 495 && n < 570) {
      bw.write("Green\n");
    } else if (n >= 450 && n < 495) {
      bw.write("Blue\n");
    } else if (n >= 425 && n < 450) {
      bw.write("Indigo\n");
    } else if (n >= 380 && n < 425) {
      bw.write("Violet\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}