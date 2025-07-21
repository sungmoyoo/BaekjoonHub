import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String hongjoon = br.readLine();

    bw.write(":fan::fan::fan:" + "\n");
    bw.write(":fan::" + hongjoon + "::fan:" + "\n");
    bw.write(":fan::fan::fan:" + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}