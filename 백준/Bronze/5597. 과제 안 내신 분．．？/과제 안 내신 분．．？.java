import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    int[] arr = new int[30];
    for (int i = 0; i < 30; i++) {
      arr[i] = i+1;
    }

    for (int i = 0; i < 28; i++) {
      int submit = Integer.parseInt(br.readLine());
      if (arr[submit-1] == submit) {
        arr[submit-1] = 0;
      }
    }
    
    for (int value : arr) {
      if (value != 0) {
        bw.write(value + "\n");
      }
    }
    
    bw.close();
    br.close();
  }
}