import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int problem = 0;

    String input;
    while (!(input = br.readLine()).equals("고무오리 디버깅 끝")) {
      if (input.equals("문제")) {
        problem++;
      } else if (input.equals("고무오리")) {
        if (problem != 0) {
          problem--;
        } else {
          problem += 2;
        }
      }
    }

    if (problem == 0) {
      bw.write("고무오리야 사랑해\n");
    } else {
      bw.write("힝구\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}