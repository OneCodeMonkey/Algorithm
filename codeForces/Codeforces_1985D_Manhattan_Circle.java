// AC: 374 ms 
// Memory: 1400 KB
// Geometry.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1985D_Manhattan_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), maxX = 0, minX = Integer.MAX_VALUE, maxY = 0, minY = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                String row = sc.next();
                for (int k = 0; k < m; k++) {
                    if (row.charAt(k) == '#') {
                        maxX = Math.max(maxX, k + 1);
                        minX = Math.min(minX, k + 1);
                        maxY = Math.max(maxY, j + 1);
                        minY = Math.min(minY, j + 1);
                    }
                }
            }

            System.out.println((maxY + minY) / 2 + " " + (maxX + minX) / 2);
        }
    }
}
