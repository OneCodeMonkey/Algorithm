// AC: 359 ms 
// Memory: 1856 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1941C_Rudolf_and_the_Ugly_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextInt();
            String s = sc.next();
            int ret = 0;
            for (int j = 0; j < s.length() - 2; ) {
                if (s.startsWith("map", j)) {
                    ret++;
                    if (j + 2 < s.length() - 2 && s.startsWith("pie", j + 2)) {
                        j += 5;
                    } else {
                        j += 2;
                    }
                } else if (s.startsWith("pie", j)) {
                    ret++;
                    j += 3;
                } else {
                    j++;
                }
            }

            System.out.println(ret);
        }
    }
}
