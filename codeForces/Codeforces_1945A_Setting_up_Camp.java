// AC: 327 ms 
// Memory: 500 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1945A_Setting_up_Camp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), ret = -1;
            if (b % 3 == 0) {
                ret = a + b / 3 + (c % 3 == 0 ? c / 3 : (c / 3 + 1));
            } else {
                if ((3 - b % 3) <= c) {
                    ret = a + ((b + c) % 3 == 0 ? (b + c) / 3 : ((b + c) / 3 + 1));
                }
            }

            System.out.println(ret);
        }
    }
}
