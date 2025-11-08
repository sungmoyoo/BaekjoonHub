import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] message = br.readLine().toCharArray();
    int happiness = 0;
    int sadness = 0;

    for (int i = 0; i < message.length - 2; i++) {
      if (message[i] == ':' && message[i+1] == '-') {
        if (message[i+2] == ')') {
          happiness++;
        } else if (message[i+2] == '(') {
          sadness++;
        }
      }
    }

    if (happiness == 0 && sadness == 0) {
      bw.write("none\n");
    } else if (happiness > sadness) {
      bw.write("happy\n");
    } else if (happiness < sadness) {
      bw.write("sad\n");
    } else {
      bw.write("unsure\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}