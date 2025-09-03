import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<String, String> map = new HashMap<>();
    map.put("NLCS" , "North London Collegiate School");
    map.put("BHA", "Branksome Hall Asia");
    map.put("KIS", "Korea International School");
    map.put("SJA", "St. Johnsbury Academy");

    String input = br.readLine();

    bw.write(map.get(input) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}