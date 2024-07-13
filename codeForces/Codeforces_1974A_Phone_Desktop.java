// AC: 233 ms 
// Memory: 1300 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1974A_Phone_Desktop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), ret = 0;
            ret = y % 2 == 0 ? y / 2 : (y / 2 + 1);
            int remain = (y % 2 == 1) ? (7 * ret + 4) : 7 * ret;
            if (x > remain) {
                ret += (x - remain) % 15 == 0 ? (x - remain) / 15 : ((x - remain) / 15 + 1);
            }

            System.out.println(ret);
        }
    }
}
