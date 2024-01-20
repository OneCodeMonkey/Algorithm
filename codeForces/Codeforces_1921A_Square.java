// AC: 155 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1921A_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int prevX = Integer.MIN_VALUE, prevY = 0, edgeLength = 0;
            for (int j = 0; j < 4; j++) {
                int x = sc.nextInt(), y = sc.nextInt();
                if (prevX == Integer.MIN_VALUE) {
                    prevX = x;
                    prevY = y;
                } else {
                    if (prevX == x) {
                        edgeLength = Math.abs(y - prevY);
                    }
                }
            }
            System.out.println(edgeLength * edgeLength);
        }
    }
}
