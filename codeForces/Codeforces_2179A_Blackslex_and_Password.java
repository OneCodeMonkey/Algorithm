// AC: 218 ms  
// Memory: 1100 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2179A_Blackslex_and_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt(), x = sc.nextInt(), ret = 0;
            if (x == 1) {
                ret = k + 1;
            } else {
                ret = k * x + 1;
            }

            System.out.println(ret);
        }
    }
}
