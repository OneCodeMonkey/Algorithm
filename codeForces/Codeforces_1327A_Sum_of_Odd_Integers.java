// AC: 1091 ms 
// Memory: 0 KB
// if odd or even type is same, and n >= k * k, then we can always find such answer, otherwise not.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1327A_Sum_of_Odd_Integers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            if ((n % 2 == 0 && k % 2 == 1) || (n % 2 == 1 && k % 2 == 0)) {
                System.out.println("NO");
            } else {
                long square = (long) k * k;
                if (n < square) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
