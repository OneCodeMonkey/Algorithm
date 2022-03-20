// AC: Time: 404 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_41A_Translation {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next(), t = sc.next();
        System.out.println(new StringBuilder(s).reverse().toString().equals(t) ? "YES" : "NO");
    }
}
