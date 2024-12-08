// AC: 343 ms 
// Memory: 1400 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0378A_Playing_with_Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] ret = new int[3];
        for (int i = 1; i <= 6; i++) {
            int a1 = Math.abs(a - i), b1 = Math.abs(b - i);
            if (a1 == b1) {
                ret[1]++;
            } else if (a1 < b1) {
                ret[0]++;
            } else {
                ret[2]++;
            }
        }
        System.out.println(ret[0] + " " + ret[1] + " " + ret[2]);
    }
}
