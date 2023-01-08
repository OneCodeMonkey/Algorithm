// AC: 327 ms 
// Memory: 600 KB
// Brute-force.
// T:O(logn), S:O(logn)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1619B_Squares_and_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sqrtRoot = (int) Math.sqrt(n), cubeRoot = (int) Math.cbrt(n);
            HashSet<Integer> record = new HashSet<>();
            for (int j = 1; j <= sqrtRoot; j++) {
                record.add(j * j);
            }
            for (int j = 1; j <= cubeRoot; j++) {
                record.add((int) Math.pow(j, 3));
            }
            System.out.println(record.size());
        }
    }
}
