import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String word = br.readLine();
    String[] arr = word.split("");

    for (int i = 0; i < arr.length/2; i++) {
      String temp = arr[i];
      arr[i] = arr[arr.length-i-1];
      arr[arr.length-i-1] = temp;
    }

    if (String.join("", arr).equals(word)) {
      bw.write(1 + "\n");
    } else {
      bw.write(0 + "\n");
    }

    bw.close();
    br.close();

  }
}