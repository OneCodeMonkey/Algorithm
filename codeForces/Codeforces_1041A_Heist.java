// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1041A_Heist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minVal = Integer.MAX_VALUE, maxVal = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            minVal = Math.min(minVal, a);
            maxVal = Math.max(maxVal, a);
        }
        System.out.println(maxVal - minVal + 1 - n);
    }
}
