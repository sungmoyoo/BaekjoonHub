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

    int[] A = new int[10];
    int[] B = new int[10];

    int roundWinnerA = 0;
    int roundWinnerB = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 10; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 10; i++) {
      B[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < 10; i++) {
      if (A[i] > B[i]) {
        roundWinnerA++;
      } else if (A[i] < B[i]){
        roundWinnerB++;
      }
    }

    if (roundWinnerA > roundWinnerB) {
      bw.write("A\n");
    } else  if (roundWinnerA < roundWinnerB) {
      bw.write("B\n");
    } else {
      bw.write("D\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}