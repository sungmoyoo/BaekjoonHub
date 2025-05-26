import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static String[] week = {"MON","TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());

    int month = 1;
    int daySum = 0;

    while (x != month) {
      daySum += days[month];
      month++;
    }

    daySum += y;
    int weekIdx = daySum % 7 - 1 < 0 ? 6 : daySum % 7 - 1;

    bw.write(week[weekIdx]);

    bw.flush();
    bw.close();
    br.close();
  }
}