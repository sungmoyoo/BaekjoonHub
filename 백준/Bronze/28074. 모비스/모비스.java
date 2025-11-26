import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();
    List<Character> list = new ArrayList<>();

    for (int i = 0; i < input.length(); i++) {
      list.add(input.charAt(i));
    }

    if (list.contains('M') &&
        list.contains('O') &&
        list.contains('B') &&
        list.contains('I') &&
        list.contains('S') ) {
      bw.write("YES\n");
    } else {
      bw.write("NO\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}