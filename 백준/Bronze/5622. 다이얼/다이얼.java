import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    char[] phoneNum = br.readLine().toCharArray();
    
    int time = 0;
    
    for (char value : phoneNum) {
      if (value < 68) {
        time += 3;
      } else if(value < 71) {
        time += 4;
      } else if (value < 74) {
        time += 5;
      } else if (value < 77) {
        time += 6;
      } else if (value < 80) {
        time += 7;
      } else if (value < 84) {
        time += 8;
      } else if (value < 87) {
        time += 9;
      } else {
        time += 10;
      }
    }
    
    bw.write(time + "\n");
    
    bw.flush();
    
    br.close();
    bw.close(); 
  }
}