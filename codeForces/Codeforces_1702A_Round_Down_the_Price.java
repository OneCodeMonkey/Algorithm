// AC: 296 ms 
// Memory: 0 KB
// .
// T:O(sum(logmi)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1702A_Round_Down_the_Price {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int m = SC.nextInt(), mCopy = m, expTenCount = 0;
            while (mCopy > 0) {
                expTenCount++;
                mCopy /= 10;
            }
            System.out.println(m - (int) Math.pow(10, expTenCount - 1));
        }
    }
}
