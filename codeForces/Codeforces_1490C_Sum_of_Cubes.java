// AC: 233 ms 
// Memory: 0 KB
// If there exists a^3 + b^3 = x and a >= b, then `a` must be in the range of [(num / 2) ^ 1/3, num ^ 1/3], 
// travel through this range and check if we can find such number pair.
// T:O(sum(ni ^ 1/3)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1490C_Sum_of_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long x = sc.nextLong();
            System.out.println(check(x) ? "YES" : "NO");
        }
    }

    private static boolean check(long num) {
        if (num < 2 || num > 1e12) {
            return false;
        }
        int minPossibleRoot = (int) Math.cbrt(num * 1.0 / 2), maxPossibleRoot = (int) Math.cbrt(num);
        for (int i = maxPossibleRoot; i >= minPossibleRoot; i--) {
            long left = (long) (num - Math.pow(i, 3));
            if (left == 0) {
                return false;
            }
            long cubeRoot = (long) Math.cbrt(left);
            if (Math.pow(cubeRoot, 3) == left) {
                return true;
            }
        }
        return false;
    }
}
