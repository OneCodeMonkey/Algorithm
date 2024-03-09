// AC: 420 ms 
// Memory: 800 KB
// .
// T:O(sum(ni)), S:O(1) ~ O(max(ni))
// 
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1920A_Satisfying_Constraints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), low = 0, high = Integer.MAX_VALUE;
            List<Integer> notEqual = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt(), x = sc.nextInt();
                if (a == 1) {
                    low = Math.max(low, x);
                } else if (a == 2) {
                    high = Math.min(high, x);
                } else if (a == 3) {
                    notEqual.add(x);
                }
            }
            int ret = 0;
            if (high >= low) {
                ret = high - low + 1;
                for (int item : notEqual) {
                    if (item >= low && item <= high) {
                        ret--;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
