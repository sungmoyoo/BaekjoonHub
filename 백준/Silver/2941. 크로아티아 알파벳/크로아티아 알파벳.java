import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    str = str.replaceAll("c=", "c");
    str = str.replaceAll("c-", "c");
    str = str.replaceAll("dz=", "d");
    str = str.replaceAll("d-", "D");
    str = str.replaceAll("lj", "l");
    str = str.replaceAll("nj", "n");
    str = str.replaceAll("s=", "s");
    str = str.replaceAll("z=", "z");

    bw.write(str.length() + "\n");

    bw.close();
    br.close();

  }
}