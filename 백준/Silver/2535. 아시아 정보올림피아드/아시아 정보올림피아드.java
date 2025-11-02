import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  static class Student {
    int countryNum;
    int studentNum;
    int studentScore;

    public Student(int countryNum, int studentNum, int studentScore) {
      this.countryNum = countryNum;
      this.studentNum = studentNum;
      this.studentScore = studentScore;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    Student[] list = new Student[N];
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int cn = Integer.parseInt(st.nextToken());
      int sn = Integer.parseInt(st.nextToken());
      int ss = Integer.parseInt(st.nextToken());

      map.putIfAbsent(cn, 0);

      list[i] = new Student(cn, sn, ss);
    }

    Arrays.sort(list, Comparator.comparingInt((Student s) -> s.studentScore).reversed());

    int count = 0;
    for (Student s : list) {
      map.putIfAbsent(s.countryNum, 0);

      if (map.get(s.countryNum) >= 2) {
        continue;
      }

      bw.write(s.countryNum + " " + s.studentNum + "\n");
      map.put(s.countryNum, map.get(s.countryNum) + 1);
      count++;
      
      if (count == 3) {
        break;
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}