// AC: Time: 218 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_131A_cAPS_lOCK {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        if (str.length() == 1) {
            System.out.println(Character.isUpperCase(str.charAt(0)) ? str.toLowerCase() : str.toUpperCase());
        } else {
            boolean flag = true;
            for (int i = 1; i < str.length(); i++) {
                if (Character.isLowerCase(str.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println(str);
            } else {
                StringBuilder ret = new StringBuilder();
                for (char c : str.toCharArray()) {
                    ret.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
                }
                System.out.println(ret.toString());
            }
        }
    }
}
