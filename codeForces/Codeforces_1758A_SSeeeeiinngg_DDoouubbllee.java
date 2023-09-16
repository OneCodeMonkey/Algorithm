// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Codeforces_1758A_SSeeeeiinngg_DDoouubbllee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            Deque<Character> charList = new ArrayDeque<>();
            for (char c : s.toCharArray()) {
                charList.addFirst(c);
                charList.addLast(c);
            }
            StringBuilder ret = new StringBuilder();
            for (char c : charList) {
                ret.append(c);
            }

            System.out.println(ret);
        }
    }
}
