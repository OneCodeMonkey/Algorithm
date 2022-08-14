// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_935A_Fafa_and_his_Company {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                ret++;
            }
        }

        System.out.println(ret);
    }
}
