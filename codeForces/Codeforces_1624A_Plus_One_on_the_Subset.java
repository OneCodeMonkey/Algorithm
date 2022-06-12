// AC: 795 ms 
// Memory: 0 KB
// operations needed can be proved equal to (max elemen - min element)
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1624A_Plus_One_on_the_Subset {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                maxVal = Math.max(maxVal, a);
                minVal = Math.min(minVal, a);
            }
            System.out.println(maxVal - minVal);
        }
    }
}
