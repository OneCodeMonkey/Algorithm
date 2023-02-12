// AC: 217 ms 
// Memory: 0 KB
// Constructive.
// T:O(sum(ni)). S:O(max(ni)), n = stri.length()
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1626A_Equidistant_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            String s = sc.next();
            HashMap<Character, Integer> countLetter = new HashMap<>();
            for (char c : s.toCharArray()) {
                countLetter.merge(c, 1, Integer::sum);
            }
            StringBuilder even = new StringBuilder(), odd = new StringBuilder();
            for (char c : countLetter.keySet()) {
                if (countLetter.get(c) == 1) {
                    odd.append(c);
                } else {
                    even.append(c);
                }
            }
            even.append(even);
            even.append(odd);
            System.out.println(even);
        }
    }
}
