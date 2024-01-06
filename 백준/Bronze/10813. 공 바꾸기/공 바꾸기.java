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
    StringTokenizer st = new StringTokenizer(br.readLine());
   
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] basket = new int[N];
      
      
    for (int n = 1; n <= N; n++) {
      basket[n-1] = n;
    }
      
    
    for (int m = 0; m < M; m++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      
      int temp = basket[i-1];
      basket[i-1] = basket[j-1];
      basket[j-1] = temp;

    }
    for (int value : basket) {
      bw.write(value + " ");
    }
      
    bw.close();
    br.close();
  }
}