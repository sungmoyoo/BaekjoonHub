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

    int frontCount = 0;

    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      for (int j = 0; j < 4; j++) {
        if (st.nextToken().equals("0")) {
          frontCount++;
        }
      }
      bw.write(getResult(frontCount));
      bw.newLine();

      frontCount = 0;
    }


    bw.flush();
    bw.close();
    br.close();
  }

  private static String getResult(int f) {
    if (f == 1) {
      return "A";
    } else if (f == 2) {
      return "B";
    } else if (f == 3) {
      return "C";
    } else if (f == 4) {
      return "D";
    } else {
      return "E";
    }
  }

}
