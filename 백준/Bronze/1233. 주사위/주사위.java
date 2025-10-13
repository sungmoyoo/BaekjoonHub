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
    int S1 = Integer.parseInt(st.nextToken());
    int S2 = Integer.parseInt(st.nextToken());
    int S3 = Integer.parseInt(st.nextToken());

    int[] count = new int[S1 + S2 + S3 + 1];

    for (int i = 1; i <= S1; i++) {
      for (int j = 1; j <= S2; j++) {
        for (int k = 1; k <= S3; k++) {
          count[i + j + k]++;
        }
      }
    }

    int maxCount = 0;
    int answer = 0;

    for (int sum = 3; sum <= S1 + S2 + S3; sum++) {
      if (count[sum] > maxCount) {
        maxCount = count[sum];
        answer = sum;
      }
    }

    bw.write(answer + "\n");
    
    bw.flush();
    bw.close();
    br.close();
  }
}