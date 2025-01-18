// Time: 921 ms 
// Memory: 1300 KB
// Record the accumulated sum.
// T:O(sum(ni + qi)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1744B_Even_Odd_Increments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), q = sc.nextInt();
            long oddSum = 0, oddCount = 0, evenSum = 0, evenCount = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    oddSum += a;
                    oddCount++;
                } else {
                    evenSum += a;
                    evenCount++;
                }
            }
            long addOdd = 0, addEven = 0;
            for (int j = 0; j < q; j++) {
                int type = sc.nextInt(), x = sc.nextInt();
                if (type == 0) {
                    if (x % 2 == 0) {
                        evenSum += evenCount * x;
                    } else {
                        evenSum += evenCount * x;
                        oddCount += evenCount;
                        evenCount = 0;
                    }
                } else {
                    if (x % 2 == 0) {
                        oddSum += oddCount * x;
                    } else {
                        oddSum += oddCount * x;
                        evenCount += oddCount;
                        oddCount = 0;
                    }
                }

                System.out.println(oddSum + evenSum);
            }
        }
    }
}
