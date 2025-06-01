// Time: 249 ms 
// Memory: 600 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2065A_Skibidus_and_Amog_u {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next(), ret = s.substring(0, s.length() - 2) + "i";

            System.out.println(ret);
        }
    }
}
