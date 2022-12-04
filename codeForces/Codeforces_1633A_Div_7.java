// Time: 187 ms 
// Memory: 100 KB
// brute-foce
// T:(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1633A_Div_7 {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int n = SC.nextInt();
            if (n % 7 == 0) {
                System.out.println(n);
            } else {
                for (int j = (n - (n % 10)); ; j++) {
                    if (j % 7 == 0) {
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }
}
