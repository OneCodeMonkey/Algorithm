// AC: 186 ms 
// Memory: 0KB
// number theory: in this case max(i, j) is gcd(j/2, j%2==0?j:j-1)=j/2
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1370A_Maximum_GCD {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n / 2);
        }
    }
}
