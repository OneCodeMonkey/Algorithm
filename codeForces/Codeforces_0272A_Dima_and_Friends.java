// AC: 560 ms 
// Memory: 800 KB
// Bad！题目英文描述比较迷惑。实际一圈要 count 多少个人读完没明白。查了下题解发现说是所有 fingers 总数.
// T:O(n), S:O(1)
//
import java.util.Scanner;

public class Codeforces_0272A_Dima_and_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, ret = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        for (int i = 1; i <= 5; i++) {
            if ((i + sum) % (n + 1) != 1) {
                ret++;
            }
        }

        System.out.println(ret);
    }
}
