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

    int n = Integer.parseInt(st.nextToken())+1;
    int k = Integer.parseInt(st.nextToken());

    int[][] pascal = new int[n][];

    for (int i = 0; i < n; i++) {
      pascal[i] = new int[i+1];

      pascal[i][0] = 1;
      pascal[i][i] = 1;

      for (int j = 1; j < i; j++) {
        pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
      }
    }

    bw.write(pascal[n-2][k-1] + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}