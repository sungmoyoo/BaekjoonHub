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

    // 알파벳을 key, 개수를 value로 저장하기 위해 HashMap 사용
    Map<Character, Integer> countMap = new HashMap<>();

    // 받은 문자를 전부 대문자로 변환
    String word = br.readLine().toUpperCase();

    // 문자열에서 알파벳 개수 세기
    for (char c : word.toCharArray()) {
      countMap.put(c, countMap.getOrDefault(c, 0) + 1);
    }

    Character maxKey = null;
    int maxCount = Integer.MIN_VALUE;

    // 최댓값 탐색
    for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxKey = entry.getKey();
        maxCount = entry.getValue();
      } else if (entry.getValue() == maxCount) {
        maxKey = '?';
      }
    }

    bw.write(maxKey + "\n");

    bw.close();
    br.close();

  }
}