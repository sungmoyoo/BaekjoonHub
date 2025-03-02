import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String N;
    while ((N = br.readLine()) != null && !N.isEmpty()) {
      int size = (int) Math.pow(3, Integer.parseInt(N));
      char[] arr = new char[size];

      Arrays.fill(arr, '-');

      solution(arr, 0, size);
      bw.write(new String(arr) + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }

  public static void solution(char[] arr, int start, int size) {
      if (size < 3) {
        return;
      }

      int part = size / 3;

      for (int i =  start + part; i < start + 2 * part; i++) {
        arr[i] = ' ';
      }

      solution(arr, start, part);
      solution(arr, start + 2 * part, part);
  }
}


