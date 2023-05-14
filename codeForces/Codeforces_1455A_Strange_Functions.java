// AC: 186 ms 
// Memory: 0 KB
// The answer depends on how many digits the number has.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1455A_Strange_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            System.out.println(n.length());
        }
    }
}
