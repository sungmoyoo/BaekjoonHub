import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[3];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 3; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    for (int i = 0; i < 3; i++) {
      bw.write(arr[i] + " ");
    }
    bw.newLine();

    bw.flush();
    br.close();
    bw.close();
  }
}
