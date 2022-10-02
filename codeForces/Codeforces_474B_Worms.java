// AC: 966 ms 
// Memory: 5600 KB
// Use fastReader otherwise it will timeout
// T:O(n), S:O(n)
// 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Codeforces_474B_Worms {
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
        int n = sc.nextInt(), sum = 0, pos = 0;
        TreeMap<Integer, Integer> mapping = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            pos++;
            mapping.put(sum, pos);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt(), index;
            if (mapping.containsKey(q)) {
                index = mapping.get(q);
            } else {
                Map.Entry<Integer, Integer> entry = mapping.floorEntry(q);
                index = entry == null ? 1 : entry.getValue() + 1;
            }
            System.out.println(index);
        }
    }
}
