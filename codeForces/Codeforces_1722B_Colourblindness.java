// AC: 186 ms
// Memory: 0 KB
// thought: Do as it says.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1722B_Colourblindness {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String str1 = sc.next(), str2 = sc.next();
            boolean isSame = true;
            for (int j = 0; j < n; j++) {
                char c1 = str1.charAt(j), c2 = str2.charAt(j);
                if ((c1 == 'R' && (c2 == 'G' || c2 == 'B')) ||
                        (c2 == 'R' && (c1 == 'G' || c1 == 'B'))) {
                    isSame = false;
                    break;
                }
            }
            System.out.println(isSame ? "YES" : "NO");
        }
    }
}
