// AC: 421 ms 
// Memory: 1204 KB
// Game: Strategy: 实际操作中，我们先将将数组排序，那么从最大的元素开始，如果最大元素个数为奇数，那么直接选中该元素，对方只能继续选最大的这个，那么跟着选，对方最终一定无可选。
// 如果最大的元素个数为偶数，那么先手选此元素，对手只需跟着选，必败。所以需要往下找第二大的元素，只要第二大元素个数为奇数，那么选择此先手。此后对方选第二大则跟着选第二大，对方选第一大，则跟着选第一大，也是必赢。
// 只有当所有元素个数都为偶数时，对手可以跟着你选，此种情形必输。
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1990A_Submission_Bait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record.merge(a, 1, Integer::sum);
            }
            boolean flag = false;
            for (int key : record.keySet()) {
                if (record.get(key) % 2 == 1) {
                    flag = true;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
