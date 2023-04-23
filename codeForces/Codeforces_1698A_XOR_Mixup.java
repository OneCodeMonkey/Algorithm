// AC: 499 ms 
// Memory: 0 KB
// Any element can make x ^ (others...) = 0, so output any one
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1698A_XOR_Mixup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            for (int j = 0; j < n; j++) {
                ret = sc.nextInt();
            }

            System.out.println(ret);
        }
    }
}
