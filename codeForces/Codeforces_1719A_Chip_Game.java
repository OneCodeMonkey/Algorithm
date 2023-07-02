// AC: 311 ms 
// Memory: 0 KB
// All step is (row + col - 2), since one can move 1 or 3 step, if mod 4 left 1,3, then the first player always win, otherwise lose.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1719A_Chip_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), moveStep = n + m - 2, remain = moveStep % 4;
            System.out.println((remain == 1 || remain == 3) ? "Burenka" : "Tonya");
        }
    }
}
