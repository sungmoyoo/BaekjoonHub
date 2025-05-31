import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int cute = 0;
    int notCute = 0;
    for (int i = 0; i < N; i++) {
      if (Integer.parseInt(br.readLine()) == 0) {
        notCute++;
      } else {
        cute++;
      }
    }

    if (cute > notCute) {
      bw.write("Junhee is cute!");
    } else {
      bw.write("Junhee is not cute!");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}