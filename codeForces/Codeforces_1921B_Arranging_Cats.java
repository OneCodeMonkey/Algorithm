// AC: 249 ms 
// Memory: 300 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1921B_Arranging_Cats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next(), f = sc.next();
            int countS = 0, countF = 0;
            for (int j = 0; j < n; j++) {
                char c1 = s.charAt(j), c2 = f.charAt(j);
                if (c1 != c2) {
                    if (c1 == '1') {
                        countS++;
                    } else {
                        countF++;
                    }
                }
            }
            System.out.println(Math.max(countS, countF));
        }
    }
}
