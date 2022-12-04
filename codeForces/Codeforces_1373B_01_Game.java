// Time: 218 ms 
// Memory: 0 KB
// No trick, just count possible pairs.
// T: O(sum(si.length)), S:O(max(si.length))
// 
import java.util.Scanner;
import java.util.Stack;

public class Codeforces_1373B_01_Game {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            String s = SC.next();
            Stack<Character> record = new Stack<>();
            int pairs = 0;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!record.empty() && ((c == '0' && record.peek() == '1') || (c == '1' && record.peek() == '0'))) {
                    record.pop();
                    pairs++;
                    while (record.size() > 1) {
                        char top = record.pop();
                        if ((top == '0' && record.peek() == '1') || (top == '1' && record.peek() == '0')) {
                            record.pop();
                            pairs++;
                        } else {
                            record.add(top);
                            break;
                        }
                    }
                } else {
                    record.add(c);
                }
            }

            System.out.println(pairs % 2 == 1 ? "DA" : "NET");
        }
    }
}
