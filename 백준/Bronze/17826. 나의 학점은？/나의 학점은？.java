import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[50];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 50; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int score = Integer.parseInt(br.readLine());

    Arrays.sort(arr);

    int rank = 51;

    for (int i = 0; i < 50; i++) {
      if (arr[i] > score) {
        break;
      } else {
        rank--;
      }
    }

    if (rank < 6) {
      bw.write("A+\n");
    } else if (rank < 16) {
      bw.write("A0\n");
    } else if (rank < 31) {
      bw.write("B+\n");
    } else if (rank < 36) {
      bw.write("B0\n");
    } else if (rank < 46) {
      bw.write("C+\n");
    } else if (rank < 49) {
      bw.write("C0\n");
    } else {
      bw.write("F\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}