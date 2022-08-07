// AC: 249 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1537A_Arithmetic_Array {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0;
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            if (sum < n) {
                System.out.println(1);
            } else if (sum == n) {
                System.out.println(0);
            } else {
                System.out.println(sum - n);
            }
        }
    }
}
