// Time: 312 ms 
// Memory: 1100 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0610A_Pasha_and_Stick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        if (n >= 6 && n % 2 == 0) {
            ret = n % 4 == 0 ? (n / 4 - 1) : n / 4;
        }

        System.out.println(ret);
    }
}
