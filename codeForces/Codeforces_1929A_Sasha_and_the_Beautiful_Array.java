// AC: 405 ms 
// Memory: 400 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1929A_Sasha_and_the_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                minVal = Math.min(minVal, a);
                maxVal = Math.max(maxVal, a);
            }

            System.out.println(maxVal - minVal);
        }
    }
}
