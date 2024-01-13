// AC: 374 ms 
// Memory: 0 KB
// Greedy. The min value is sum up all the elements and get rounded up with divided by x. The max value is divided by the raw elements and then sum.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1471A_Strange_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt();
            long sum = 0, maxVal = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                maxVal += a % x == 0 ? a / x : (a / x + 1);
                sum += a;
            }
            long minVal = sum % x == 0 ? sum / x : (sum / x + 1);
            System.out.println(minVal + " " + maxVal);
        }
    }
}
