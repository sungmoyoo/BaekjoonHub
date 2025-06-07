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

    int X = Integer.parseInt(st.nextToken());
    int Y = Integer.parseInt(st.nextToken());

    int result = Rev(Rev(X) + Rev(Y));

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  private static int Rev(int n) {
    char[] arr = String.valueOf(n).toCharArray();

    StringBuilder sb = new StringBuilder();

    for (int i = arr.length-1; i >= 0; i--) {
      sb.append(arr[i]);
    }

    return Integer.parseInt(String.valueOf(sb));
  }

}