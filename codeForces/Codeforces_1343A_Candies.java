// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(t * logn), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1343A_Candies {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int k = 2; k < Integer.MAX_VALUE; k++) {
                int divider = (int) Math.pow(2, k) - 1;
                if (n % divider == 0) {
                    System.out.println(n / divider);
                    break;
                }
            }
        }
    }
}
