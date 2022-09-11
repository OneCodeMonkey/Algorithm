// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(sum(str[i].length)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1579A_Casimir_s_String_Solitaire {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            int aCount = 0, bCount = 0, cCount = 0;
            for (char c : str.toCharArray()) {
                if (c == 'A') {
                    aCount++;
                }
                if (c == 'B') {
                    bCount++;
                }
                if (c == 'C') {
                    cCount++;
                }
            }

            System.out.println(aCount + cCount == bCount ? "YES" : "NO");
        }
    }
}
