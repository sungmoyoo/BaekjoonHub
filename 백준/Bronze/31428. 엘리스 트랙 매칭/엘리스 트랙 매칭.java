import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    char[] friends = new char[N];
    for (int i = 0; i < N; i++) {
      friends[i] = st.nextToken().charAt(0);
    }
    char h = br.readLine().charAt(0);

    int count = 0;
    for (char c : friends) {
      if (c == h) {
        count++;
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}