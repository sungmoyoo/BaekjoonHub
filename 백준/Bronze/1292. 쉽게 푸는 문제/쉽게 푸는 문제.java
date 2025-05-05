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

    int[] arr = new int[1001];

    int n = 1;
    int count = 0;
    int index = 0;

    while (index < arr.length) {
      if (count == n) {
        n++;
        count = 0;
      }
      
      arr[index] = n;
      count++;
      index++;
    }

    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int sum = 0;

    for (int i = A-1; i <= B-1; i++) {
      sum += arr[i];
    }

    bw.write(sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
