import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] xPoints = new int[N];
    int[] yPoints = new int[N];

    for (int i = 0; i < N; i++) {
      xPoints[i] = sc.nextInt();
      yPoints[i] = sc.nextInt();
    }

    Arrays.sort(xPoints);
    Arrays.sort(yPoints);

    System.out.println((xPoints[N-1] - xPoints[0]) * (yPoints[N-1] - yPoints[0]));
  }
}

