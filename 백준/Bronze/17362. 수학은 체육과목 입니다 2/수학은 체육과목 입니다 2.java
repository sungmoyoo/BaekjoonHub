import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] choice = {2, 1, 2, 3, 4, 5, 4, 3};

    int answer = n % 8;

    bw.write(choice[answer] + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}