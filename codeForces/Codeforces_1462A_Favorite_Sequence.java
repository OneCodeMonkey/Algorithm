// AC: 498 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1462A_Favorite_Sequence {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), pos = 0;
            int[] record = new int[n];
            for (int j = 0; j < n; j++) {
                record[pos++] = sc.nextInt();
            }
            int left = 0, right = n - 1;
            while (left <= right) {
                if (left == right) {
                    System.out.print(record[left]);
                    break;
                }
                System.out.print(record[left++]);
                System.out.print(" ");
                System.out.print(record[right--]);
                if (left <= right) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
