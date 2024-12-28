// Time: 453 ms 
// Memory: 2000 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1866A_Ambitious_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            minVal = Math.min(minVal, Math.abs(a));
        }
        System.out.println(minVal);
    }
}
