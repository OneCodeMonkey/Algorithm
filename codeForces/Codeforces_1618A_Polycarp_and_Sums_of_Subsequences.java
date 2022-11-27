// Time: 389 ms 
// Memory: 0 KB
// simple output a1, a2, a7-a1-a2
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1618A_Polycarp_and_Sums_of_Subsequences {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int a1 = SC.nextInt(), a2 = SC.nextInt(), a3 = SC.nextInt(), a4 = SC.nextInt(), a5 = SC.nextInt(),
                    a6 = SC.nextInt(), a7 = SC.nextInt();
            System.out.printf("%d %d %d", a1, a2, a7 - a1 - a2);
            System.out.println();
        }
    }
}
