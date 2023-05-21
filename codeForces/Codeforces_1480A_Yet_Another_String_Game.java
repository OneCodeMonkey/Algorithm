// AC: 233 ms 
// Memory: 100 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1480A_Yet_Another_String_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (j % 2 == 0) {
                    if (c != 'a') {
                        c = 'a';
                    } else {
                        c = 'b';
                    }
                } else {
                    if (c != 'z') {
                        c = 'z';
                    } else {
                        c = 'y';
                    }
                }
                sb.append(c);
            }

            System.out.println(sb.toString());
        }
    }
}
