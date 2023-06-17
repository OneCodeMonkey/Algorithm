// AC: 372 ms 
// Memory: 0 KB
// Since the string can reorder in any way, keep odd count letter with 0 or odd times will be the first win.
// T:O(n), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_0276B_Little_Girl_and_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            letterCount.merge(c, 1, Integer::sum);
        }
        int countOdd = 0;
        for (char c : letterCount.keySet()) {
            if (letterCount.get(c) % 2 == 1) {
                countOdd++;
            }
        }
        System.out.println((countOdd == 0 || countOdd % 2 == 1) ? "First" : "Second");
    }
}
