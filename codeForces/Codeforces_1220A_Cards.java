// AC: 373 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1220A_Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), countOne = 0, countZero = 0;
        String s = sc.next();
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.merge(c, 1, Integer::sum);
        }
        countZero = count.getOrDefault('z', 0);
        countOne = count.getOrDefault('n', 0);
        for (int i = 0; i < countOne; i++) {
            System.out.print("1 ");
        }
        for (int i = 0; i < countZero; i++) {
            System.out.print(0);
            if (i != countZero - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}
