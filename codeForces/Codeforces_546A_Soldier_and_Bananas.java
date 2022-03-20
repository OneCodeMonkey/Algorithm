// AC: Time: 171 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_546A_Soldier_and_Bananas {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();
        int total = w * (w + 1) / 2 * k;
        System.out.println(total > n ? total - n : 0);
    }
}
