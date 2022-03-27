// AC: Time: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_61A_Ultra_Fast_Mathematician {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next(), str2 = sc.next();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                ret.append("1");
            } else {
                ret.append("0");
            }
        }
        System.out.println(ret.toString());
    }
}
