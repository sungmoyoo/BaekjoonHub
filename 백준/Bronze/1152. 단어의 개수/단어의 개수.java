import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String[] words = br.readLine().trim().split(" ");
    
    if (words[0].isBlank()) {
      bw.write(words.length-1 + "\n");
    } else {
      bw.write(words.length + "\n");
    }
    bw.close();
    br.close();
  }
}