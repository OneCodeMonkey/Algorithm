// AC: 1762 ms 
// Memory: 7500 KB
// Notice: sum may overflow Integer range. Using FastReader otherwise java may timeout.
// array, prefix sum
// T:O(nlogn + q), S:O(n)
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Codeforces_1697B_Promo {
    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt(), q = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<Long> prefixSum = new ArrayList<>();
        prefixSum.add(0L);
        long curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum += arr[i];
            prefixSum.add(curSum);
        }
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println(prefixSum.get(n - x + y) - prefixSum.get(n - x));
        }
    }
}
