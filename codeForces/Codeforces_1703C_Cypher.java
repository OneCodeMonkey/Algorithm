// Time: 296 ms
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1703C_Cypher {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int n = SC.nextInt(), pos = 0;
            int[] now = new int[n];
            for (int j = 0; j < n; j++) {
                now[pos++] = SC.nextInt();
            }
            for (int j = 0; j < n; j++) {
                int b = SC.nextInt(), finalMove = 0;
                String moves = SC.next();
                for (int k = 0; k < b; k++) {
                    if (moves.charAt(k) == 'U') {
                        finalMove++;
                    } else {
                        finalMove--;
                    }
                }
                finalMove = finalMove % 10;
                if (finalMove > 0) {
                    now[j] = (now[j] - finalMove) >= 0 ? (now[j] - finalMove) : (now[j] - finalMove + 10);
                } else {
                    now[j] = (now[j] - finalMove) <= 9 ? (now[j] - finalMove) : (now[j] - finalMove - 10);
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.print(now[j]);
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
