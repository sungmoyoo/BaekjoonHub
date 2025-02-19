import com.sun.jdi.Value;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> countList = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      int a = Integer.parseInt(br.readLine());
      map.put(a, map.getOrDefault(a, 0)+1);
      list.add(a);
    }

    Collections.sort(list);

    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;
    int maxCount = 0;
    int totalSum = list.stream().mapToInt(Integer::intValue).sum();

    // 최대값, 최소값, 최빈값 계산
    for (Entry<Integer, Integer> e : map.entrySet()) {
      int key = e.getKey();
      int value = e.getValue();

      maxValue = Math.max(maxValue, key);
      minValue = Math.min(minValue, key);

      if (value > maxCount) {
        maxCount = value;
        countList.clear();
        countList.add(key);
      } else if (value == maxCount) {
        countList.add(key);
      }

    }

    // 산술평균
    bw.write(Math.round((double) totalSum / N) + "\n");

    // 중앙값
    bw.write(list.get(N/2) + "\n");

    // 최빈값
    if (countList.size() > 1) {
      Collections.sort(countList);
      bw.write(countList.get(1) + "\n");
    } else {
      bw.write(countList.get(0) + "\n");
    }

    // 범위
    bw.write(maxValue-minValue + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}