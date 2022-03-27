// AC: Time: 186 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_486A_Calculating_Function {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        System.out.println((n % 2 == 0) ? n / 2 : (-n - 1) / 2);
    }
}
