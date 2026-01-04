import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();
    char[] mbti = br.readLine().toCharArray();

    for (char c : mbti) {
      if (c == 'E') {
        sb.append("I");
      } else if (c == 'I'){
        sb.append("E");
      } else if (c == 'S'){
        sb.append("N");
      } else if (c == 'N'){
        sb.append("S");
      } else if (c == 'T'){
        sb.append("F");
      } else if (c == 'F'){
        sb.append("T");
      } else if (c == 'P'){
        sb.append("J");
      } else if (c == 'J'){
        sb.append("P");
      }
    }

    bw.write(sb + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}