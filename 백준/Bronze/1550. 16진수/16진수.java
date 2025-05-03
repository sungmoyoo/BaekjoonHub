import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] arr = br.readLine().toCharArray();

    int result = 0;
    int degree = 0;
    for (int i = arr.length-1; i >= 0; i--) {
      int num;

      if (arr[i] >= 'A' && arr[i] <= 'F') {
        num = arr[i] - 'A' + 10;
      } else {
        num = Character.getNumericValue(arr[i]);
      }
      result += num * (int) Math.pow(16, degree);
      degree++;
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
