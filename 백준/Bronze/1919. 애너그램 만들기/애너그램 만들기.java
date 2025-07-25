import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] word1 = br.readLine().toCharArray();
    char[] word2 = br.readLine().toCharArray();

    int[] count1 = new int[26];
    int[] count2 = new int[26];

    for (char c : word1) {
      count1[c - 'a']++;
    }

    for (char c : word2) {
      count2[c - 'a']++;
    }

    int diff = 0;
    for (int i = 0; i < 26; i++) {
      diff += Math.abs(count1[i] - count2[i]);
    }

    bw.write(diff + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}