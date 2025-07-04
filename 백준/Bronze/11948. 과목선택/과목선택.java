import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] science = new int[4];
    int[] society = new int[2];

    for (int i = 0; i < 4; i++) {
      science[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < 2; i++) {
      society[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(science);
    Arrays.sort(society);

    int maxScore = 0;
    for (int i = 1; i < 4; i++) {
      maxScore += science[i];
    }

    maxScore += society[1];

    bw.write(maxScore + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}