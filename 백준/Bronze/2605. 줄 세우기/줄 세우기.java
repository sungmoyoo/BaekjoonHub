import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    List<Integer> list = new LinkedList<>();

    int students = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 1; i <= students; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (num == 0) {
        list.add(i);
      } else {
        list.add(i-num-1 ,i);
      }
    }

    for (int i : list) {
      bw.write(i + " ");
    }

    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}