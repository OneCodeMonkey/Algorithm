// AC: 296 ms 
// Memory: 1000 KB
// Greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1997A_Strong_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            char prev = ' ';
            int sameIndex = -1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == prev) {
                    sameIndex = j - 1;
                    break;
                }
                prev = s.charAt(j);
            }
            if (sameIndex != -1) {
                char anotherChar = s.charAt(sameIndex) == 'a' ? 'b' : 'a';
                System.out.println(s.substring(0, sameIndex + 1) + anotherChar + s.substring(sameIndex + 1));
            } else {
                char anotherChar = s.charAt(s.length() - 1) == 'a' ? 'b' : 'a';
                System.out.println(s + anotherChar);
            }
        }
    }
}
