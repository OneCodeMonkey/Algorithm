// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1360A_Minimal_Square {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), minVal = Math.min(a, b), maxVal = Math.max(a, b), squareSize = Math.max(2 * minVal, maxVal);
            System.out.println(squareSize * squareSize);
        }
    }
}
