// AC: 203 ms 
// Memory: 600 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2148A_Sublime_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), n = sc.nextInt();

            System.out.println(n % 2 == 1 ? x : 0);
        }
    }
}
