// AC: 186 ms 
// Memory: 0 KB
// .
// T:O(log(m/n)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1141A_Game_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), ret = -1;
        if (m % n == 0) {
            ret = 0;
            int divide = m / n;
            while (divide > 1) {
                if (divide % 2 == 0) {
                    divide /= 2;
                } else if (divide % 3 == 0) {
                    divide /= 3;
                } else {
                    ret = -1;
                    break;
                }
                ret++;
            }
        }
        System.out.println(ret);
    }
}
