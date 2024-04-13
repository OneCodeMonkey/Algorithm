// AC: 624 ms 
// Memory: 11600 KB
// Array Segment count & Sort: We need to find the most frequency position, and assign with the maximum value of the array, 
// then the next frequency position, and assign with the second maximum value of array.
// Notice: Using FasterReader class instead of `Scanner(System.in)`, otherwise the Java solution could TLE.
// T:O(nlogn), S:O(n)
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Codeforces_0276C_Little_Girl_and_Maximum_Sum {
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
        int n = sc.nextInt(), q = sc.nextInt();
        long ret = 0;
        Integer[] arr = new Integer[n];
        int[] segmentStart = new int[n], segmentEnd = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            segmentStart[l - 1]++;
            segmentEnd[r - 1]++;
        }
        int cur = 0;
        PriorityQueue<Integer> countOccurence = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < n; i++) {
            if (segmentStart[i] > 0) {
                cur += segmentStart[i];
            }
            if (cur > 0) {
                countOccurence.offer(cur);
            }
            if (segmentEnd[i] > 0) {
                cur -= segmentEnd[i];
            }
        }
        Arrays.sort(arr);
        int pos = n - 1;
        while (!countOccurence.isEmpty()) {
            int occurence = countOccurence.poll();
            ret += (long) occurence * arr[pos--];
        }

        System.out.println(ret);
    }
}
