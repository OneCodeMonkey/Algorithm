// AC: 1390 ms 
// Memory: 31200 KB
// Binary Search, Or using TreeMap.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_1742E_Scuza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), q = sc.nextInt(), maxVal = -1;
            long[] prefixSum = new long[n + 1];
            TreeMap<Integer, Integer> valToIndex = new TreeMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                maxVal = Math.max(maxVal, a);
                valToIndex.putIfAbsent(maxVal, j);
                prefixSum[j + 1] = prefixSum[j] + a;
            }
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < q; j++) {
                int k = sc.nextInt();
                Integer index = valToIndex.ceilingKey(k + 1);
                if (index == null) {
                    ret.append(prefixSum[n]);
                } else {
                    ret.append(prefixSum[valToIndex.get(index)]);
                }
                if (j != q - 1) {
                    ret.append(" ");
                }
            }

            System.out.println(ret);
        }
    }
}
