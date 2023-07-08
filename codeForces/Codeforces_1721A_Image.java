// AC: 202 ms 
// Memory: 100 KB
// .
// T:O(t), S:O(1)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1721A_Image {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s1 = sc.next(), s2 = sc.next();
            HashSet<Character> letters = new HashSet<>();
            for (char c : s1.toCharArray()) {
                letters.add(c);
            }
            for (char c : s2.toCharArray()) {
                letters.add(c);
            }

            System.out.println(letters.size() - 1);
        }
    }
}
