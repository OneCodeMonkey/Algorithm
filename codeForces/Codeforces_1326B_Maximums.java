// AC: 358 ms 
// Memory: 4828 KB
// See the regularity.
// T:O(n), S:O(n)
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforces_1326B_Maximums {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        StringBuilder ret = new StringBuilder();
        ret.append(arr[0]);
        ret.append(" ");
        int curPosiSum = Math.max(arr[0], 0);
        for (int i = 1; i < n; i++) {
            ret.append(curPosiSum + arr[i]);
            if (arr[i] >= 0) {
                curPosiSum += arr[i];
            }
            if (i != n - 1) {
                ret.append(" ");
            }
        }

        System.out.println(ret);
    }

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
}
