// AC: 187 ms 
// Memory: 0 KB
// Thought: math.
// T:O(sum(ni)), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1353C_Board_Moves {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long ret = 0;
            for (int j = n; j >= 3; j -= 2) {
                ret += 2L * (j - 1) * (j - 1);
            }
            System.out.println(ret);
        }
    }
}
