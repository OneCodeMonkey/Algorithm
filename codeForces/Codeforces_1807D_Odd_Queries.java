// AC: 1622 ms 
// Memory: 8300 KB
// Prefix sum.
// T:O(sum(ni + qi)), S:O(max(ni))
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforces_1807D_Odd_Queries {
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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), q = sc.nextInt();
            int[] arr = new int[n];
            long[] prefixSum = new long[n + 1], suffixSum = new long[n + 1];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                prefixSum[j + 1] = prefixSum[j] + a;
            }
            for (int j = n - 1; j >= 0; j--) {
                suffixSum[j] = suffixSum[j + 1] + arr[j];
            }
            for (int j = 0; j < q; j++) {
                int l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();
                long sum = prefixSum[l - 1] + suffixSum[r] + (long) (r - l + 1) * k;
                System.out.println(sum % 2 == 1 ? "YES" : "NO");
            }
        }
    }
}
