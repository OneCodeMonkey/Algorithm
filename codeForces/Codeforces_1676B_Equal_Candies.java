// AC: 249 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1676B_Equal_Candies {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), minVal = Integer.MAX_VALUE, sum = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                minVal = Math.min(minVal, a);
                sum += a;
            }
            System.out.println(sum - minVal * n);
        }
    }
}
