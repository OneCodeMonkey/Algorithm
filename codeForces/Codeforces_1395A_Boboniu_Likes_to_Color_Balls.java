// AC: 311 ms 
// Memory: 2300 KB
// Math: 不管怎么转，最后 r,g,b,w 最多只能有一个奇数，而奇数次 operation 才会改变此格局.
// 所以至多尝试一次，看能否使其至多有一个奇数
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1395A_Boboniu_Likes_to_Color_Balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt(), w = sc.nextInt();
            boolean ret = false;
            int countOdd = 0;
            countOdd += r % 2 == 1 ? 1 : 0;
            countOdd += g % 2 == 1 ? 1 : 0;
            countOdd += b % 2 == 1 ? 1 : 0;
            countOdd += w % 2 == 1 ? 1 : 0;
            if (countOdd <= 1) {
                ret = true;
            } else {
                if (r >= 1 && g >= 1 && b >= 1) {
                    w += 3;
                    r--;
                    g--;
                    b--;
                    countOdd = 0;
                    countOdd += r % 2 == 1 ? 1 : 0;
                    countOdd += g % 2 == 1 ? 1 : 0;
                    countOdd += b % 2 == 1 ? 1 : 0;
                    countOdd += w % 2 == 1 ? 1 : 0;
                    if (countOdd <= 1) {
                        ret = true;
                    }
                }
            }

            System.out.println(ret ? "Yes" : "No");
        }
    }
}
