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

    int startHour = Integer.parseInt(st.nextToken());
    int startMin = Integer.parseInt(st.nextToken());
    int startSec = Integer.parseInt(st.nextToken());

    int restTime = Integer.parseInt(br.readLine());

    int restHour = restTime/3600;
    restTime %= 3600;
    int restMin = restTime / 60;
    restTime %= 60;
    int restSec = restTime;

    int endSec = startSec + restSec;
    int endMin = startMin + restMin;
    int endHour = startHour + restHour;

    if (endSec >= 60) {
      endSec %= 60;
      endMin++;
    }

    if (endMin >= 60) {
      endMin %= 60;
      endHour++;
    }


    if (endHour >= 24) {
      endHour %= 24;
    }

    bw.write(endHour + " " + endMin + " " + endSec);
    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}