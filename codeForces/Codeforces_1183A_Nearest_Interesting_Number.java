// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(logn), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1183A_Nearest_Interesting_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), ret = 0;
        for (int i = a; ; i++) {
            int i2 = i, digitSum = 0;
            while (i2 > 0) {
                digitSum += i2 % 10;
                i2 /= 10;
            }
            if (digitSum % 4 == 0) {
                ret = i;
                break;
            }
        }

        System.out.println(ret);
    }
}
