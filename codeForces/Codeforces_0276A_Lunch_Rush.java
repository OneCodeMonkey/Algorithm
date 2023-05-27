// AC: 468 ms 
// Memory: 0 KB
// Notice the description, we can only choose exactly one restaurant.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0276A_Lunch_Rush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), ret = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt(), t = sc.nextInt();
            ret = Math.max(ret, t > k ? (f - (t - k)) : f);
        }
        System.out.println(ret);
    }
}
