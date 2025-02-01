// Time: 249 ms 
// Memory: 600 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2033A_Sakurako_and_Kosuke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n % 2 == 0 ? "Sakurako" : "Kosuke");
        }
    }
}
