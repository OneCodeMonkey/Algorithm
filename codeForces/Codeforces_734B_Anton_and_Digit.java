// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_734B_Anton_and_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k2 = sc.nextInt(), k3 = sc.nextInt(), k5 = sc.nextInt(), k6 = sc.nextInt(), ret = 0;
        int count256 = Math.min(k2, Math.min(k5, k6));
        ret = count256 * 256 + Math.min(k2 - count256, k3) * 32;

        System.out.println(ret);
    }
}
