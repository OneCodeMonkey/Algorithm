// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n^(3/2)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_472A_Design_Tutorial_Learn_from_Math {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(4 + " " + (n - 4));
        } else {
            for (int i = 4; i <= n / 2; i++) {
                if (checkComposite(i) && checkComposite(n - i)) {
                    System.out.println(i + " " + (n - i));
                    return;
                }
            }
        }
    }

    private static boolean checkComposite(int n) {
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                return true;
            }
        }

        return false;
    }
}
