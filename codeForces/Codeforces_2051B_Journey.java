// Time: 342 ms 
// Memory: 600 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2051B_Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), ret = 0;
            int roundSum = a + b + c, round = n / roundSum, remain = n % roundSum;
            ret += round * 3;
            if (remain == 0) {
            } else if (remain <= a) {
                ret += 1;
            } else if (remain <= a + b) {
                ret += 2;
            } else {
                ret += 3;
            }

            System.out.println(ret);
        }
    }
}
