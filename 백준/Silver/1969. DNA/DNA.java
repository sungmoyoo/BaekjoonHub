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

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    String[] dna = new String[N];
    for (int i = 0; i < N; i++) {
      dna[i] = br.readLine();
    }

    int[][] count = new int[M][4];

    for (int i = 0; i < N; i++) {
      String s = dna[i];
      for (int j = 0; j < M; j++) {
        char c = s.charAt(j);
        if (c == 'A') count[j][0]++;
        else if (c == 'C') count[j][1]++;
        else if (c == 'G') count[j][2]++;
        else if (c == 'T') count[j][3]++;
      }
    }

    StringBuilder sb = new StringBuilder();
    int hammingDistance = 0;

    for (int j = 0; j < M; j++) {
      int maxCount = -1;
      int idx = -1;

      for (int k = 0; k < 4; k++) {
        if (count[j][k] > maxCount) {
          maxCount = count[j][k];
          idx = k;
        } else if (count[j][k] == maxCount) {
          if (idx > k) idx = k;
        }
      }

      char c = ' ';
      if (idx == 0) c = 'A';
      else if (idx == 1) c = 'C';
      else if (idx == 2) c = 'G';
      else if (idx == 3) c = 'T';

      sb.append(c);
      hammingDistance += (N - maxCount);
    }

    bw.write(sb + "\n");
    bw.write(hammingDistance + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}