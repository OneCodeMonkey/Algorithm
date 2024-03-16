// AC: 404 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1933A_Turtle_Puzzle_Rearrange_and_Negate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                ret += Math.abs(a);
            }
            System.out.println(ret);
        }
    }
}
