import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static List<Integer> list = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    mergeSort(arr, 0, arr.length - 1);

    if (list.size() < K) {
      bw.write(-1 + "\n");
    } else {
      bw.write(list.get(K-1) + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }

  public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;

      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);

      merge(arr, left, mid, right);
    }
  }

  public static void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] leftTmp = new int[n1];
    int[] rightTmp = new int[n2];

    System.arraycopy(arr, left, leftTmp, 0, n1);
    System.arraycopy(arr, mid+1, rightTmp, 0, n2);

    int i = 0;
    int j = 0;
    int k = left;
    while (i < n1 && j < n2) {
      if (leftTmp[i] <= rightTmp[j]) {
        arr[k] =leftTmp[i++];
      } else {
        arr[k] = rightTmp[j++];
      }
      list.add(arr[k++]);
    }

    while (i < n1) {
      arr[k] = leftTmp[i++];
      list.add(arr[k++]);
    }

    while (j < n2) {
      arr[k] = rightTmp[j++];
      list.add(arr[k++]);
    }
  }
}


