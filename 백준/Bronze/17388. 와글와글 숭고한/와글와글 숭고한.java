import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  static class Unibersity implements Comparable<Unibersity> {
    String name;
    int score;

    public Unibersity(String name, int score) {
      this.name = name;
      this.score = score;
    }

    @Override
    public int compareTo(Unibersity o) {
      return this.score - o.score;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int S = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());

    Unibersity[] arr = new Unibersity[3];
    arr[0] = new Unibersity("Soongsil", S);
    arr[1] = new Unibersity("Korea", K);
    arr[2] = new Unibersity("Hanyang", H);

    int sum = S + K + H;
    if (sum >= 100) {
      bw.write("OK\n");
    } else {
      Arrays.sort(arr);
      bw.write(arr[0].name + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}