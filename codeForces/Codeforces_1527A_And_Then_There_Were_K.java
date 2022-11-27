// AC: 467 ms 
// Memory: 0 KB
// bitmask: count the binary bit x, and then (2^(x-1) - 1) is the max value which meets the requirement.
// T:O(sum(logn)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1527A_And_Then_There_Were_K {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int n = SC.nextInt(), exp2 = 0;
            while (n > 0) {
                exp2++;
                n >>= 1;
            }
            System.out.println((int) Math.pow(2, exp2 - 1) - 1);
        }
    }
}
