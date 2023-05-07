// AC: 561 ms 
// Memory: 0 KB
// Greedy. Starting from the end, find the special sequence where we can find a position i, which from the i to two sides, the elements are non-increasing.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1385C_Make_It_Good {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
            }

            // direction：1 表示从末尾往前，是不下降的顺序。-1 表示从末尾往前，是在下降的顺序
            // 思路：从末尾开始往前找，找到最长的子数组，这个数组能找到一个元素 Index，从 Index 往两端的方向，每一段都是小于 Index 且往下不增的趋势。
            // 例如：1 2 4 3 2，以 4 为 Index，往前后两边的元素，相对 Index 都是不增的趋势。
            int direction = 1;
            int curMax = 0, prev = 0, retIndex = -1;
            for (int j = n - 1; j >= 0; j--) {
                if (arr[j] > prev) {
                    if (direction == 1) {
                        curMax = Math.max(curMax, arr[j]);
                    } else {
                        retIndex = j;
                        break;
                    }
                } else if (arr[j] == prev) {
                    //
                } else {
                    if (direction == 1) {
                        direction = -1;
                    } else {
                        //
                    }
                }

                prev = arr[j];
            }

            System.out.println(retIndex == -1 ? 0 : retIndex + 1);
        }
    }
}
