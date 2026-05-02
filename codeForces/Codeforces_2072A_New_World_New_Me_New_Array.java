// Time: 327 ms 
// Memory: 400 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2072A_New_World_New_Me_New_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), p = sc.nextInt(), ret = -1;
            k = Math.abs(k);
            if (n * p >= k) {
                ret = (k % p) == 0 ? (k / p) : (k / p + 1);
            }

            System.out.println(ret);
        }
    }
}
