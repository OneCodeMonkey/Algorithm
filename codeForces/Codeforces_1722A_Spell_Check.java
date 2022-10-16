// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(n)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1722A_Spell_Check {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        HashSet<Character> check = new HashSet<>(), temp = new HashSet<>();
        for (char c : "Timur".toCharArray()) {
            check.add(c);
        }
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n == 5) {
                temp.clear();
                for (char c : s.toCharArray()) {
                    temp.add(c);
                }
                if (check.equals(temp)) {
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
