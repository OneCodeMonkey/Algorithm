// Time: 546 ms 
// Memory: 28100 KB
// 注意：没必要按次序 每个数组依次取一个，然后交替。你可以一次连续从某个数组中取出N个，再从另一个数组中连续取出N个。
// T:O(n), S:O(n)
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Codeforces_1831B_Array_merging {
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
            int n = sc.nextInt();
            HashMap<Integer, Integer> maxContinousLengthA = new HashMap<>(), maxContinousLengthB = new HashMap<>();
            int cur = 0, prev = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (j == 0) {
                    cur = 1;
                    maxContinousLengthA.put(a, 1);
                } else {
                    if (a == prev) {
                        cur++;
                    } else {
                        cur = 1;
                    }
                    maxContinousLengthA.put(a, Math.max(cur, maxContinousLengthA.getOrDefault(a, 0)));
                }
                prev = a;
            }
            cur = 0;
            prev = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (j == 0) {
                    cur = 1;
                    maxContinousLengthB.put(a, 1);
                } else {
                    if (a == prev) {
                        cur++;
                    } else {
                        cur = 1;
                    }
                    maxContinousLengthB.put(a, Math.max(cur, maxContinousLengthB.getOrDefault(a, 0)));
                }
                prev = a;
            }

            int ret = 0;
            for (int j : maxContinousLengthA.keySet()) {
                ret = Math.max(ret, maxContinousLengthA.get(j) + maxContinousLengthB.getOrDefault(j, 0));
            }
            for (int j : maxContinousLengthB.keySet()) {
                ret = Math.max(ret, maxContinousLengthB.get(j) + maxContinousLengthA.getOrDefault(j, 0));
            }

            System.out.println(ret);
        }
    }
}
