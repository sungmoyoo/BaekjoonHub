import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      String[] sentence = br.readLine().split(" ");

      for (String word : sentence) {
        StringBuilder sb = new StringBuilder(word).reverse();
        bw.write(sb + " ");
      }
      bw.newLine();
    }

    bw.flush();
    bw.close();
    br.close();
  }
}