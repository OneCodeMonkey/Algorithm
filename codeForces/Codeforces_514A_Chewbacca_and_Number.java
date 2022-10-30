// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_514A_Chewbacca_and_Number {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long x = sc.nextLong();
        String xStr = String.valueOf(x);
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < xStr.length(); i++) {
            char c = xStr.charAt(i);
            if (i == 0 && c == '9') {
                ret.append(c);
            } else {
                if (c <= '4') {
                    ret.append(c);
                } else {
                    ret.append(9 - Integer.parseInt(String.valueOf(c)));
                }
            }
        }

        System.out.println(ret.toString());
    }
}
