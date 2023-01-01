// AC: 234 ms 
// Memory: 0 KB
// Geography.
// T:O(t), S:O(1)
// 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforces_1547A_Shortest_Path_with_Obstacle {
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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
//            sc.next();
            int xa = sc.nextInt(), ya = sc.nextInt(), xb = sc.nextInt(), yb = sc.nextInt(), xc = sc.nextInt(),
                    yc = sc.nextInt();
            if (xa != xb && ya != yb) {
                System.out.println(Math.abs(xa - xb) + Math.abs(ya - yb));
            } else if (xa == xb) {
                int max = Math.max(ya, yb), min = Math.min(ya, yb);
                if (xc == xa && (yc > min && yc < max)) {
                    System.out.println(max - min + 2);
                } else {
                    System.out.println(max - min);
                }
            } else {
                int max = Math.max(xa, xb), min = Math.min(xa, xb);
                if (yc == ya && (xc > min && xc < max)) {
                    System.out.println(max - min + 2);
                } else {
                    System.out.println(max - min);
                }
            }
        }
    }
}
