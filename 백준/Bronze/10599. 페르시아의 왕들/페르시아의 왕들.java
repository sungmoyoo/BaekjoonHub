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
    while (!(input = br.readLine()).equals("0 0 0 0")) {
      String[] abcd = input.split(" ");
      int[] ages = new int[4];

      for (int i = 0; i < abcd.length; i++) {
        ages[i] = Integer.parseInt(abcd[i]);
      }

      bw.write((ages[2] - ages[1]) + " " + (ages[3] - ages[0]) + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}