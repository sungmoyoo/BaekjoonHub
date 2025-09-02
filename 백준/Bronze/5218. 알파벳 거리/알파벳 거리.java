import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {
    ArrayList<Integer> answer = new ArrayList<>();

    for (int i = 0; i < s1.length(); i++) {
      int c1 = s1.charAt(i) - 'a';
      int c2 = s2.charAt(i) - 'a';

      int dist = c2 - c1;
      if (dist < 0) dist += 26;

      answer.add(dist);
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numCases = sc.nextInt();

    for (int i = 0; i < numCases; i++) {
      String s1 = sc.next();
      String s2 = sc.next();

      ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
      System.out.print("Distances: ");

      for (Integer d : answer) {
        System.out.print(d + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}