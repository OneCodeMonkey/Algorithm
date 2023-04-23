// AC: 436 ms 
// Memory: 0 KB
// hashmap.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1722C_Word_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String[][] record = new String[3][n];
            HashMap<String, Integer> countTimes = new HashMap<>();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < n; k++) {
                    String word = sc.next();
                    record[j][k] = word;
                    countTimes.merge(word, 1, Integer::sum);
                }
            }

            for (int j = 0; j < 3; j++) {
                int score = 0;
                for (int k = 0; k < n; k++) {
                    int time = countTimes.get(record[j][k]);
                    if (time == 1) {
                        score += 3;
                    } else if (time == 2) {
                        score += 1;
                    }
                }
                System.out.print(score);
                if (j < 2) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
