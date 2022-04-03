// AC: Time: 374 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1030A_In_Search_of_an_Easy_Problem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        StringBuilder ret = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()) {
                if ("WUB".equals(str.substring(i, i + 3))) {
                    if (!flag) {
                        ret.append(" ");
                        flag = true;
                    }
                    i += 2;
                } else {
                    ret.append(str.charAt(i));
                    flag = false;
                }
            } else {
                ret.append(str.charAt(i));
            }
        }
        System.out.println(ret.toString().trim());
    }
}
