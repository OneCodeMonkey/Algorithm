// AC: Time: 233 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_996A_Hit_the_Lottery {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 0;
        while (n > 0) {
            for (int divider : Arrays.asList(100, 20, 10, 5, 1)) {
                if (n / divider >= 1) {
                    ret += n / divider;
                    n -= (n / divider) * divider;
                    break;
                }
            }
        }
        System.out.println(ret);
    }
}
