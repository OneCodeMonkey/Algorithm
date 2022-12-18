// AC: 920 ms 
// Memory: 1200 KB
// do not use Arrays.sort(), it's worst case is O(n^2)!!
// T:O(nlogn), S:O(n)
// 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Codeforces_433B_Kuriyama_Mirai_s_Stones {
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
        FastReader sc = new FastReader(new BufferedInputStream(System.in));
        int n = sc.nextInt(), pos = 0;
        List<Integer> raw = new ArrayList<>();
        long curSum = 0;
        long[] sum = new long[n + 1], sum2 = new long[n + 1];
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            raw.add(v);
            curSum += v;
            sum[++pos] = curSum;
        }
        Collections.sort(raw);
        curSum = 0;
        pos = 0;
        for (int i = 0; i < n; i++) {
            curSum += raw.get(i);
            sum2[++pos] = curSum;
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int type = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
            if (type == 1) {
                System.out.println(sum[r] - sum[l - 1]);
            } else {
                System.out.println(sum2[r] - sum2[l - 1]);
            }
        }
    }
}
