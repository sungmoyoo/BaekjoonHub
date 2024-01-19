import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    String[] Alist = st.nextToken().split("");
    String[] Blist = st.nextToken().split("");
    
    Alist = swap(Alist);
    Blist = swap(Blist);
    
    int A = Integer.parseInt(String.join("", Alist));
    int B = Integer.parseInt(String.join("", Blist));
    
    if (A > B) {
      bw.write(A + "\n");
    } else {
      bw.write(B + "\n");
    }
    
   br.close();
   bw.close();
   
  }
  static String[] swap(String[] arr) {
    String temp = arr[0];
    arr[0] = arr[2];
    arr[2] = temp;
    
    return arr;
  }
}