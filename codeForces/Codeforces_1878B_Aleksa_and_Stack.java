// AC: 1450 ms	
// Memory: 0 KB
// Construct: when n >= 5, sequence [n, n+1, n+2, ...] is one of the answer.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1878B_Aleksa_and_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.print(5 + j);
                if (j != n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
