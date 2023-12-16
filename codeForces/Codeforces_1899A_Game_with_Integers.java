// AC: 186 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1899A_Game_with_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(((n + 1) % 3 == 0 || (n - 1) % 3 == 0) ? "First" : "Second");
        }
    }
}
