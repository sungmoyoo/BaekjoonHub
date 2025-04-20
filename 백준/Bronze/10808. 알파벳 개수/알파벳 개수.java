import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] counts = new int[26];

        for (int i = 0; i < S.length(); i++) {
            counts[S.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            bw.write(counts[i] + " ");
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}