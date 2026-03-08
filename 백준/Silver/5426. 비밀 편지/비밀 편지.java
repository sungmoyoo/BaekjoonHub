import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0) {
      char[] letter = br.readLine().toCharArray();

      int size = (int) Math.sqrt(letter.length);
      char[][] square = new char[size][size];

      int count = 0;
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          square[i][j] = letter[count++];
        }
      }

      StringBuilder sb = new StringBuilder();
      for (int i = size-1; i >= 0; i--) {
        for (int j = 0; j < size; j++) {
          sb.append(square[j][i]);
        }
      }

      bw.write(sb + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}