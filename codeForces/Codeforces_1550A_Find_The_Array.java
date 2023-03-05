// AC: 249 ms 
// Memory: 0 KB
// Greedy. 1, 3, 5, ... , 2n - 1, is the minimum size posible sequence. 
// If sum between the sequence of 1 ... 2n-1 (inclusive) and 1... 2(n-1) - 1 (exclusive). We can adjust the same size answer.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1550A_Find_The_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            System.out.println((int) Math.ceil(Math.sqrt(s)));
        }
    }
}
