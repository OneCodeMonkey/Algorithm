// AC: 1015 ms 
// Memory: 900 KB
// Math: The simplest way to make array have a common lcd > 1 is to make odd number to even. So check odd number <= k is the way.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1629B_GCD_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();
            boolean flag = false;
            if (r - l == 0) {
                flag = l > 1;
            } else if (r - l > 0) {
                int countOdd;
                if ((r - l) % 2 == 0) {
                    countOdd = (r - l) / 2 + (l % 2 == 1 ? 1 : 0);
                } else {
                    countOdd = (r - l + 1) / 2;
                }
                flag = countOdd <= k;
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
