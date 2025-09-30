import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    String input = br.readLine();
    List<Character> seats = new ArrayList<>();

    seats.add('*');

    for (int i = 0; i < input.length(); i++) {
      seats.add(input.charAt(i));
    }
    int idx = 1;
    while (idx < seats.size()){
      if (seats.get(idx) == 'S') {
        seats.add(idx+1, '*');
        idx += 2;
      } else {
        seats.add(idx+2, '*');
        idx += 3;
      }
    }

    int count = 0;
    for (char c : seats) {
      if (c == '*') {
        count++;
      }
    }
    
    bw.write(Math.min(count, N) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}