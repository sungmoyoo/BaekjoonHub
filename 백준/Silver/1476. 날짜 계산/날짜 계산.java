import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int year = 1;

        while (true) {
            int e = (year - 1) % 15 + 1;
            int s = (year - 1) % 28 + 1;
            int m = (year - 1) % 19 + 1;

            if (e == E && s == S && m == M) {
                bw.write(year + "\n");
                break;
            }

            year++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}