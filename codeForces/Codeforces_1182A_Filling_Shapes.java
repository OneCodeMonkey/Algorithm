// AC: 187 ms 
// Memory: 0 KB
// Math: n must be even, and answer is 2^(n/2)
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1182A_Filling_Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        if (n % 2 == 0) {
            ret = (int) Math.pow(2, (n / 2));
        }

        System.out.println(ret);
    }
}
