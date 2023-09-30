// AC: 280 ms 
// Memory: 0 KB
// .
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1843C_Sum_in_Binary_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(), ret = 0;
            while (n > 0) {
                ret += n;
                n /= 2;
            }

            System.out.println(ret);
        }
    }
}
