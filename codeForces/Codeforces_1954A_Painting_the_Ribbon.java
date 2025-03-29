// AC: 312 ms 
// Memory: 800 KB
// Greedy: The first player finally left a biggest heap, then left elements will be choose to paint the same color as the biggest.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1954A_Painting_the_Ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int maxHeap = n % m == 0 ? n / m : (n / m + 1);

            System.out.println(n - maxHeap > k ? "YES" : "NO");
        }
    }
}
