// AC: Time: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_520A_Pangram {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();
        HashSet<Character> record = new HashSet<>();
        for (char c : str.toCharArray()) {
            record.add(Character.toLowerCase(c));
            if (record.size() == 26) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
