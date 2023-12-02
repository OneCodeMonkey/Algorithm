// AC: 1637 ms 
// Memory: 24400 KB
// Constructive.
// Notice: Use fastReader or java may timeout.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Codeforces_1862B_Sequence_Game {
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
            int n = sc.nextInt(), prev = -1;
//            int[] arr = new int[n];
            List<Integer> ret = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                int b = sc.nextInt();
                if (j == 0) {
                    ret.add(b);
                } else {
                    ret.add(b);
                    if (b < prev) {
                        ret.add(b);
                    }
                }
                prev = b;
            }
            System.out.println(ret.size());
            for (int item : ret) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
