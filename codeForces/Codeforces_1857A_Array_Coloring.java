// AC: 234 ms  
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1857A_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0;
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }

            System.out.println(sum % 2 == 0 ? "YES" : "NO");
        }
    }
}
