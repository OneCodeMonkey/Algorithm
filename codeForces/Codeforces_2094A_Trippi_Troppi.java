// Time: 233 ms 
// Memory: 800 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2094A_Trippi_Troppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                String s = sc.next();
                ret.append(s.charAt(0));
            }

            System.out.println(ret);
        }
    }
}
