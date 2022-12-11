// Time: 295 ms
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1760A_Medium_Number {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int a = SC.nextInt(), b = SC.nextInt(), c = SC.nextInt();
            int maxVal = Math.max(Math.max(a, b), c), minVal = Math.min(Math.min(a, b), c);
            System.out.println(a + b + c - maxVal - minVal);
        }
    }
}
