// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1551A_Polycarp_and_Coins {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), pair = n / 3, left = n - pair * 3;
            int c1 = pair + (left == 1 ? 1 : 0), c2 = pair + (left == 2 ? 1 : 0);
            System.out.println(c1 + " " + c2);
        }
    }
}
