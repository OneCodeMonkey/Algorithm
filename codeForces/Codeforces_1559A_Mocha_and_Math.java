// AC: 233 ms 
// Memory: 0 KB 
// Greedy & bitmask: we can always make every element's value to a1&a2&a3...&an, that's the smallest value.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1559A_Mocha_and_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0xffffffff;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                ret &= a;
            }
            System.out.println(ret);
        }
    }
}
