// AC: 873 ms 
// Memory: 1200 KB
// Notice: using FastReader in java, otherwise it will cause TLE.
// T:O(n), S:O(n)
// 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Codeforces_368B_Sereja_and_Suffixes {
    private static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;

        public FastReader(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
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
        FastReader fr = new FastReader(new BufferedInputStream(System.in));
        int n = fr.nextInt(), m = fr.nextInt(), pos = 0;
        int[] array = new int[n], dp = new int[n];
        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < n; i++) {
            array[pos++] = fr.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            record.add(array[i]);
            dp[i] = record.size();
        }

        for (int i = 0; i < m; i++) {
            System.out.println(dp[fr.nextInt() - 1]);
        }
    }
}
