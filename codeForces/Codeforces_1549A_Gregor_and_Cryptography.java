// AC: 249 ms 
// Memory: 0 KB
// simple choose 2 and P-1 can meets the requirement.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1549A_Gregor_and_Cryptography {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int p = sc.nextInt();
            System.out.println("2 " + (p - 1));
        }
    }
}
