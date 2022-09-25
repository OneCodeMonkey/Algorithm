// AC: 1778 ms 
// Memory: 0 KB
// Notice this problem will timeout if we use Scanner, instead we should use FastReader.
// T:O(s.length() + m), S:O(s.length())
// 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforces_313B_Ilya_and_Queries {
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
        String s = fr.next();
        int curPairCount = 0;
        int[] record = new int[s.length()];
        record[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curPairCount++;
            }
            record[i] = curPairCount;
        }
        int m = fr.nextInt();
        for (int i = 0; i < m; i++) {
            int l = fr.nextInt(), r = fr.nextInt();
            System.out.println(record[r - 1] - record[l - 1]);
        }
    }
}
