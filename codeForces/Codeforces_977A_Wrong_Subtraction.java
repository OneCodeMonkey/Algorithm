// AC: Time: 187 ms 
// Memory: 0 KB
// .
// T:O(k), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_977A_Wrong_Subtraction {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
        }

        System.out.println(n);
    }
}
