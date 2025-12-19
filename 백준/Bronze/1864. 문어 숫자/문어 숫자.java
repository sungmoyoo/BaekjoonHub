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

    char[] keys   = {'-', '\\', '(', '@', '?', '>', '&', '%', '/'};
    int[] values  = { 0,   1,   2,   3,   4,   5,   6,   7,  -1};

    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < keys.length; i++) {
      map.put(keys[i], values[i]);
    }

    String input;
    while (!(input = br.readLine()).equals("#")) {
      char[] arr = input.toCharArray();

      int count = arr.length-1;
      int result = 0;
      for (char c : arr) {
        result += map.get(c) * ((int) Math.pow(8, count));
        count--;
      }

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}