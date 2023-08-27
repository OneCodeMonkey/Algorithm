// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Codeforces_0746B_Decoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder ret = new StringBuilder();
        Deque<Character> list = new ArrayDeque<>();
        list.add(s.charAt(0));
        for (int i = 1; i < n; i++) {
            if (n % 2 == 0) {
                if (i % 2 == 1) {
                    list.addLast(s.charAt(i));
                } else {
                    list.addFirst(s.charAt(i));
                }
            } else {
                if (i % 2 == 1) {
                    list.addFirst(s.charAt(i));
                } else {
                    list.addLast(s.charAt(i));
                }
            }
        }
        for (char c : list) {
            ret.append(c);
        }
        System.out.println(ret);
    }
}
