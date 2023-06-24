// AC: 311 ms 
// Memory: 0 KB
// Thought: min of (a, b) and (a + b) / 4
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1611B_Team_Composition_Programmers_and_Mathematicians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            int ret = Math.min(Math.min(a, b), (a + b) / 4);

            System.out.println(ret);
        }
    }
}
