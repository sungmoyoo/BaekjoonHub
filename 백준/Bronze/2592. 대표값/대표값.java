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

    int sum = 0;
    Map<Integer, Integer> freqMap = new HashMap<>();
    int[] numbers = new int[10];

    for (int i = 0; i < 10; i++) {
      int num = Integer.parseInt(br.readLine());
      numbers[i] = num;
      sum += num;

      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    int average = sum / 10;

    int mode = numbers[0];
    int maxCount = freqMap.get(mode);
    for (int num : freqMap.keySet()) {
      int count = freqMap.get(num);
      if (count > maxCount) {
        maxCount = count;
        mode = num;
      }
    }

    bw.write(average + "\n");
    bw.write(mode + "\n");


    bw.flush();
    bw.close();
    br.close();
  }
}