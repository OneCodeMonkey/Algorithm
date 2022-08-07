// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;
import java.util.Stack;

public class Codeforces_1374A_Move_Brackets {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            Stack<Character> record = new Stack<>();
            for (char c : s.toCharArray()) {
                if (!record.empty() && (c == ')' && record.peek() == '(')) {
                    record.pop();
                } else {
                    record.add(c);
                }
            }
            System.out.println(record.size() / 2);
        }
    }
}
