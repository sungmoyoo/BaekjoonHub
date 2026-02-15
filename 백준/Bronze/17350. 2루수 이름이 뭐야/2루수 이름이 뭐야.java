import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    boolean isExist = false;

    while (N-- > 0) {
      String name = br.readLine();
      if (name.equals("anj")) {
        isExist = true;
      }
    }

    if (isExist) {
      bw.write("뭐야;\n");
    } else {
      bw.write("뭐야?\n");
    }


    bw.flush();
    bw.close();
    br.close();
  }
}