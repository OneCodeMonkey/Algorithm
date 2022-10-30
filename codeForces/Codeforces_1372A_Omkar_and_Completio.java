// AC: 218 ms 
// Memory: 0 KB
// because it doesn't require unique, just put all same 1's is an anwser
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1372A_Omkar_and_Completio {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.print(1);
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
