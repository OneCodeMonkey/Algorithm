// AC: 311 ms 
// Memory: 0 KB
// Regularity: 0 10: -1 1 4 0 , -5  1 8 0 , -9  1  12 0
//             1 5:  2 0 -3 1 ,  6 0 -7 1 , 10 0 -11, 1
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1607B_Odd_Grasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x0 = sc.nextLong(), n = sc.nextLong(), ret = 0;
            /**
             * sequence example:
             *   0 10: -1 1 4 0 , -5  1 8 0 , -9  1  12 0
             *   1 5:  2 0 -3 1 ,  6 0 -7 1 , 10 0 -11, 1
             */
            switch ((int) (n % 4)) {
                case 0:
                    ret = x0 % 2 == 0 ? 0 : 1;
                    break;
                case 1:
                    ret = x0 % 2 == 0 ? (-1 - n / 4 * 4) : (2 + n / 4 * 4);
                    break;
                case 2:
                    ret = x0 % 2 == 0 ? 1 : 0;
                    break;
                case 3:
                    ret = x0 % 2 == 0 ? (n / 4 * 4 + 4) : (-3 - (n / 4 * 4));
                    break;
                default:
            }
            ret += x0 % 2 == 0 ? x0 : (x0 - 1);

            System.out.println(ret);
        }
    }
}
