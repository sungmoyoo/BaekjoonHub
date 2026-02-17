import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N*5; i++) {
      for (int j = 0; j < N*5; j++) {
        if (i < N || j < N) {
          bw.write("@");
        }
      }
      bw.write("\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}