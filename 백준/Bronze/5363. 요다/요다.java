import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    while (N-- > 0) {
      String[] words = br.readLine().split(" ");
      for (int i = 2; i < words.length; i++) {
        sb.append(words[i]).append(" ");
      }
      sb.append(words[0]).append(" ").append(words[1]).append("\n");
    }

    bw.write(sb + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}