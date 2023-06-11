// AC: 296 ms 
// Memory: 0 KB
// Using a math theory: 两个互质的数n，m。
//  x = a ∗ m + b ∗ n 。 a > = 0 , b > = 0 x=a*m+b*n。a>=0,b>=0x=a∗m+b∗n。a>=0,b>=0
//  其中不能构造的最大的数是n ∗ m − n − m n*m-n-mn∗m−n−m，大于n ∗ m − n − m n*m-n-mn∗m−n−m的数，都可以通过m和n构造出来。
// T:O(Math.min(m, n)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1526B_I_Hate_1111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            boolean ret = false;
            if (x > 11 * 111 - 11 - 111) {
                ret = true;
            } else {
                for (int j = 0; j * 111 <= x; j++) {
                    if ((x - j * 111) % 11 == 0) {
                        ret = true;
                        break;
                    }
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
