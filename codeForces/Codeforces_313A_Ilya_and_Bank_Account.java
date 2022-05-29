// AC: 374 ms 
// Memory: 24600 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_313A_Ilya_and_Bank_Account {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println(n);
        } else {
            if (n > -10) {
                System.out.println(0);
            } else {
                int digit1 = -n % 10, digit2 = (-n / 10) % 10;
                if (digit1 >= digit2) {
                    System.out.println(n / 10);
                } else {
                    System.out.println(-(-n / 10 - digit2 + digit1));
                }
            }
        }
    }
}
