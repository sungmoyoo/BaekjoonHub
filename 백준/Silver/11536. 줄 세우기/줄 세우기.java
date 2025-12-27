import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    String[] original = new String[N];

    for (int i = 0; i < N; i++) {
      original[i] = br.readLine();
    }

    String[] increasing = Arrays.copyOf(original, N);
    Arrays.sort(increasing);
    String[] decreasing = Arrays.copyOf(original, N);
    Arrays.sort(decreasing, Comparator.reverseOrder());

    if (Arrays.equals(original, increasing)) {
      bw.write("INCREASING\n");
    } else if (Arrays.equals(original, decreasing)) {
      bw.write("DECREASING\n");
    } else {
      bw.write("NEITHER\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}