// AC: 560 ms 
// Memory: 100 KB
// Math theory: If 5555... can be devide by 9, then the number of 5's is also divided by 9.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0352A_Jeff_and_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), countZero = 0, countFive = 0;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                countZero++;
            } else if (a == 5) {
                countFive++;
            }
        }
        if (countZero > 0) {
            if (countFive >= 9) {
                String ret = "5".repeat(countFive / 9 * 9) + "0".repeat(countZero);
                System.out.println(ret);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(-1);
        }
    }
}
