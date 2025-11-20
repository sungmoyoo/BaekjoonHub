import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    List<Integer> people = new ArrayList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < 4; i++) {
      people.add(Integer.parseInt(st.nextToken()));
    }

    st = new StringTokenizer(br.readLine());

    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());

    if (people.contains(x)) {
      bw.write((people.indexOf(x) + 1) + "\n");
    } else {
      bw.write("0\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}