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

    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int startHour = Integer.parseInt(st.nextToken());
      int startMin = Integer.parseInt(st.nextToken());
      int startSec = Integer.parseInt(st.nextToken());

      int endHour = Integer.parseInt(st.nextToken());
      int endMin = Integer.parseInt(st.nextToken());
      int endSec = Integer.parseInt(st.nextToken());

      int startTotal = startHour * 3600 + startMin * 60 + startSec;
      int endTotal = endHour * 3600 + endMin * 60 + endSec;

      int workSec = endTotal - startTotal;

      int h = workSec / 3600;
      int m = (workSec % 3600) / 60;
      int s = workSec % 60;

      bw.write(h + " " + m + " " + s + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}