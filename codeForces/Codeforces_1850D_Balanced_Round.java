// AC: 265 ms 
// Memory: 100 KB
// Using Integer[] to sort instead of int[], otherwise may case TLE.
// T:O(sum(nilogni)), S:O(max(ni))
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Codeforces_1850D_Balanced_Round {
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
            int n = sc.nextInt(), k = sc.nextInt(), ret = 0, maxContinousCount = 1, cur = 1;
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(ret);
                continue;
            }
            Arrays.sort(arr);
            for (int j = 1; j < n; j++) {
                if (arr[j] - arr[j - 1] > k) {
                    maxContinousCount = Math.max(maxContinousCount, cur);
                    cur = 1;
                } else {
                    cur++;
                    if (j == n - 1) {
                        maxContinousCount = Math.max(maxContinousCount, cur);
                    }
                }
            }
            ret = n - maxContinousCount;
            System.out.println(ret);
        }
    }
}
