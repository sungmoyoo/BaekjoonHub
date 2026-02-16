import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static double pie = 3.1415927;
  static long inchToMiles = 5280 * 12;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int count = 1;
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      double diameter = Double.parseDouble(st.nextToken());
      long spin = Long.parseLong(st.nextToken());
      double time = Double.parseDouble(st.nextToken());

     if (spin == 0) {
       break;
     }
     double distance = pie * diameter / inchToMiles * spin;
     double avgSpeed = distance / (time / 3600) ;

      System.out.printf("Trip #%d: %.2f %.2f\n", count, distance, avgSpeed);

      count++;
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}