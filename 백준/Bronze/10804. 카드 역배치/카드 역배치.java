import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] cards = new int[20];

    for (int i = 0; i < 20; i++) {
      cards[i] = i+1;
    }


    for (int i = 0; i < 10; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      int[] copy = Arrays.copyOfRange(cards, a-1, b);

      int reverseNum = copy.length-1;

      for (int j = a-1; j < b; j++) {
        cards[j] = copy[reverseNum--];
      }

    }

    for (int card : cards) {
      bw.write(card + " ");
    }

    bw.newLine();

    bw.flush();
    bw.close();
    br.close();
  }
}