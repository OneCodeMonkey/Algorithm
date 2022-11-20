// Time: 187 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_540A_Combination_Lock {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 0;
        String str1 = sc.next(), str2 = sc.next();
        for (int i = 0; i < n; i++) {
            char c1 = str1.charAt(i), c2 = str2.charAt(i);
            int diff = Math.abs(c1 - c2), diff2 = Math.abs(10 + c1 - c2), diff3 = Math.abs(c1 - c2 - 10);
            ret += Math.min(diff, Math.min(diff2, diff3));
        }
        System.out.println(ret);
    }
}
