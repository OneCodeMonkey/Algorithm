// AC: 514 ms 
// Memory: 700 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1881A_Don_t_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), ret = 0, exp = 0;
            String xStr = sc.next(), s = sc.next();
            if (!xStr.contains(s)) {
                for (int j = 2; ; j *= 2) {
                    String newX = xStr.repeat(j);
                    exp++;
                    if (newX.contains(s)) {
                        ret = exp;
                        break;
                    }
                    if (xStr.length() * j > s.length() * 3) {
                        break;
                    }
                }
                if (ret == 0) {
                    ret = -1;
                }
            }

            System.out.println(ret);
        }
    }
}
