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

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int totalHour = (N - 1) * 8;

    for (int i = 0 ; i < N; i++) {
      totalHour += Integer.parseInt(st.nextToken());
    }

    int day = totalHour / 24;
    int hour = totalHour % 24;

    bw.write(day + " " + hour + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}