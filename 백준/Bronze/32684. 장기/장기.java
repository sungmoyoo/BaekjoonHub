import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] score = {13, 7, 5, 3, 3, 2};

    String[] a = br.readLine().split(" ");
    String[] b = br.readLine().split(" ");

    double cocjr0208 = 0;
    double ekwoo = 1.5;

    for (int i = 0; i < score.length; i++) {
      cocjr0208 += score[i] * Integer.parseInt(a[i]);
      ekwoo += score[i] * Integer.parseInt(b[i]);
    }
    
    if (cocjr0208 >= ekwoo) {
      bw.write("cocjr0208\n");
    } else {
      bw.write("ekwoo\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}