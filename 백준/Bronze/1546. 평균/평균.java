import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int N = Integer.parseInt(br.readLine());
    int M = 0;
   List<Integer> scoreList = new ArrayList<>();
   StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int score = Integer.parseInt(st.nextToken());
      if(M < score) {
        M = score;
      }
      scoreList.add(score);
    }
    double sum = 0;
    
    for (double score : scoreList) {
      sum += (score / M) * 100;
    }
    
    bw.write(sum/N + "\n");
    
    bw.close();
    br.close();
  }
}