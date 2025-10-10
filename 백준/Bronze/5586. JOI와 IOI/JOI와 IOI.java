import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] arr = br.readLine().toCharArray();

    int JOI = 0;
    int IOI = 0;
    for (int i = 0; i < arr.length-2; i++) {
      if (arr[i] == 'J') {
        if (arr[i+1] == 'O' && arr[i+2] == 'I') {
          JOI++;
        }
      } else if (arr[i] == 'I') {
        if (arr[i+1] == 'O' && arr[i+2] == 'I') {
          IOI++;
        }
      }
    }

    bw.write(JOI + "\n");
    bw.write(IOI + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}