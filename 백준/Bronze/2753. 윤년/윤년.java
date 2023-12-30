import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int inputYear = keyScan.nextInt();
      
    System.out.println(inputYear % 4 == 0 && inputYear % 100 != 0 || inputYear % 400 == 0 ? 1 : 0);
    
    keyScan.close();
  }
}