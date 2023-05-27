// AC:  312 ms 
// Memory: 0 KB
// smallest result is a^b
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1421A_XORwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a ^ b);
        }
    }
}
