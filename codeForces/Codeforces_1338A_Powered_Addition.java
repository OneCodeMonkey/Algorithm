// AC: 546 ms 
// Memory: 2200 KB
// Array & DP: for every elements, find the max diff between current element and the former biggest element.
// Then try to add 1 + 2 + .. + 2^(n-1) to make diff reach, the answer is n.
// T:O(sum(ni)), S:O(1)
//  
import java.util.Scanner;

public class Codeforces_1338A_Powered_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), curMax = Integer.MIN_VALUE, maxDiff = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a > curMax) {
                    curMax = a;
                } else if (a < curMax) {
                    maxDiff = Math.max(maxDiff, curMax - a);
                }
            }
            if (maxDiff > 0) {
                int cur = 0, base = 0;
                while (cur < maxDiff) {
                    cur += Math.pow(2, base);
                    base++;
                }
                ret = base;
            }

            System.out.println(ret);
        }
    }
}
