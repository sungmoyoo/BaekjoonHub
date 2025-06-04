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
    int[] arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int M = minsik(arr);
    int Y = youngsik(arr);;

    if (M < Y) {
      bw.write("M " + M);
    } else if (M > Y) {
      bw.write("Y " + Y);
    } else {
      bw.write("Y M " + M);
    }

    bw.flush();
    bw.close();
    br.close();
  }

  public static int youngsik(int[] calls) {
    int charge = 0;

    for (int call : calls) {
      if (call < 30) {
        charge += 10;
      } else if (call < 60) {
        charge += 20;
      } else {
        charge += ((call / 30)+1) * 10;
      }

    }
    return charge;
  }

  public static int minsik(int[] calls) {
    int charge = 0;

    for (int call : calls) {
      if (call < 60) {
        charge += 15;
      } else if (call < 120) {
        charge += 30;
      } else {
        charge += ((call / 60)+1) * 15;
      }
    }
    return charge;
  }
}