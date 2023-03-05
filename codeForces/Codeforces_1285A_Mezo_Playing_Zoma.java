// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1285A_Mezo_Playing_Zoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), countLeft = 0, countRight = 0;
        String s = sc.next();
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                countLeft++;
            } else {
                countRight++;
            }
        }

        System.out.println(countLeft + countRight + 1);
    }
}
