// AC: 233 ms 
// Memory: 0 KB
// Notice: Using Integer[] to sort, otherwise Arrays.sort() could TIMEOUT, I guess when int value < 128 it goes jvm cache?
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Codeforces_1334B_Middle_Class {
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
        StringBuilder retStr = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt(), ret = 0;
            Integer[] record = new Integer[n];
            for (int j = 0; j < n; j++) {
                record[j] = sc.nextInt();
            }
            Arrays.sort(record);
            long sum = 0;
            for (int j = n - 1; j >= 0; j--) {
                sum += record[j] - x;
                if (sum < 0) {
                    break;
                }
                ret = n - j;
            }

            retStr.append(ret).append("\n");
        }

        System.out.println(retStr);
    }
}
