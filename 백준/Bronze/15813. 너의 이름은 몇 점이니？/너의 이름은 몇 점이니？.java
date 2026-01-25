import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    char[] arr = br.readLine().toCharArray();

    int score = 0;
    for (char c : arr) {
      score += c - 64;
    }

    bw.write(score + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}