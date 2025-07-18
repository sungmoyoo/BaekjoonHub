import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] kda = br.readLine().split("/");
    
    int K = Integer.parseInt(kda[0]);
    int D = Integer.parseInt(kda[1]);
    int A = Integer.parseInt(kda[2]);

    if (K + A < D || D ==0) {
      bw.write("hasu\n");
    } else {
      bw.write("gosu\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}