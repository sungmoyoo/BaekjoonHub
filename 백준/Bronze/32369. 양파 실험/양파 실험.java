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
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int compliment = 1;
    int blame = 1;
    int pattern = 0;

    while (N-- > 0) {
      if (pattern == 0) {
        compliment += A;
        blame += B;

        if (compliment < blame) {
          pattern = 1;
        } else if (compliment == blame) {
          blame--;
        }
      } else {
        compliment += B;
        blame += A;

        if (blame < compliment) {
          pattern = 0;
        } else if (compliment == blame) {
          compliment--;
        }
      }
    }
    
    if (pattern == 0) {
      bw.write(compliment + " " + blame + "\n");
    } else {
      bw.write(blame + " " + compliment + "\n");
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}