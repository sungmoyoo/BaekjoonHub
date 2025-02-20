import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
  // 다중 조건 정렬을 구현하기 위해 이름과 개수를 포함하는 클래스 생성
  public static class Word {
    String name;
    int count;

    public Word(String name, Integer count) {
      this.name = name;
      this.count = count;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    List<Word> list = new ArrayList<>();
    Map<String, Integer> count = new HashMap<>();

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    while (N-- > 0) {
      String word;
      if ((word = br.readLine()).length() >= M) {
        count.put(word, count.getOrDefault(word, 0) + 1);
      }
    }

    for (Entry<String, Integer> e : count.entrySet()) {
      list.add(new Word(e.getKey(), e.getValue()));
    }

    // 익명 Comparator 클래스를 구현하여 비교
    list.sort(new Comparator<Word>() {
      @Override
      public int compare(Word o1, Word o2) {
        // 자주 나온 단어
        if (o1.count != o2.count) {
          return Integer.compare(o2.count, o1.count);
        }

        // 단어 길이
        if (o1.name.length() != o2.name.length()) {
          return Integer.compare(o2.name.length(), o1.name.length());
        }

        // 사전순서
        return o1.name.compareTo(o2.name);
      }
    });

    for (Word word : list) {
      bw.write(word.name + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}