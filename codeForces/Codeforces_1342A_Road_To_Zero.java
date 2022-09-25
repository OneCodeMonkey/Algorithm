// AC: 171 ms 
// Memory: 0 KB
// Thought: There are two possible minimum cost ways: all use a dollars, or (maxVal - minVal) use a, minVal use b.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1342A_Road_To_Zero {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            long maxVal = Math.max(x, y), minVal = Math.min(x, y);

            System.out.println(b > 2 * a ? (maxVal + minVal) * a : ((maxVal - minVal) * a + minVal * b));
        }
    }
}
