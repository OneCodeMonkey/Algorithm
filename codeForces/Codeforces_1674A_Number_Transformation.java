// AC: 358 ms 
// Memory: 300 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1674A_Number_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            String ret = "0 0";
            if (y >= x && y % x == 0) {
                ret = "1 " + (y / x);
            }
            System.out.println(ret);
        }
    }
}
