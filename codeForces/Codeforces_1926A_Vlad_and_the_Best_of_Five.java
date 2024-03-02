// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1926A_Vlad_and_the_Best_of_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int countA = 0;
            for (char c : s.toCharArray()) {
                if (c == 'A') {
                    countA++;
                }
            }

            System.out.println(countA > s.length() - countA ? 'A' : 'B');
        }
    }
}
