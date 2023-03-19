// AC: 218 ms 
// Memory: 0 KB
// We can always split the three parts into two parts equally.
// T:O(q), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1196A_Three_Piles_of_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();

            System.out.println((a + b + c) / 2);
        }
    }
}
