// AC: 842 ms 
// Memory: 24900 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1343B_Balanced_Array {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int even = 2, odd = 1;
                for (int j = 0; j < n / 2; j++, even += 2) {
                    System.out.print(even + " ");
                }
                for (int j = 0; j < n / 2 - 1; j++, odd += 2) {
                    System.out.print(odd + " ");
                }
                System.out.println(odd + n / 2);
            }
        }
    }
}
