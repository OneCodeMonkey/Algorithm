// Time: 374 ms 
// Memory: 1100 KB
// Math.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2114A_Square_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int num = Integer.parseInt(s), sqrtN = (int) Math.sqrt(num);
            if (sqrtN * sqrtN == num) {
                System.out.println(0 + " " + sqrtN);
            } else {
                System.out.println(-1);
            }
        }
    }
}
