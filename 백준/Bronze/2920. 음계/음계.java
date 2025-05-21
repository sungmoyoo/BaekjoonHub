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

    StringTokenizer st = new StringTokenizer(br.readLine());
    boolean ascending = true;
    boolean descending = true;

    int[] arr = new int[8];

    for (int i = 0; i < 8; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 1; i < 8; i++) {
      if (arr[i-1]+1 != arr[i]) {
        ascending = false;
      }
      if (arr[i-1]-1 != arr[i]) {
        descending = false;
      }
    }

    if (ascending) {
      bw.write("ascending");
    } else if (descending) {
      bw.write("descending");
    } else {
      bw.write("mixed");
    }
    bw.newLine();


    bw.flush();
    bw.close();
    br.close();
  }
}