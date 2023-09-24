// AC: 1730 ms 
// Memory: 0 KB
// Greedy.
// T:O(sum(ni logni)), S:O(max(ni))
// 
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_1355B_Young_Explorers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
//            int[] arr = new int[n];
            TreeMap<Integer, Integer> count = new TreeMap<>();
            for (int j = 0; j < n; j++) {
                int e = sc.nextInt();
//                arr[j] = e;
                count.merge(e, 1, Integer::sum);
            }
            int remain = 0;
            for (int item : count.keySet()) {
                int countTime = count.get(item);
                if (remain + countTime >= item) {
                    ret += (remain + countTime) / item;
                    remain = (remain + countTime) % item;
                } else {
                    remain += countTime;
                }
            }

            System.out.println(ret);
        }
    }
}
