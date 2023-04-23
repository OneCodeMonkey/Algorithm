// AC: 249 ms 
// Memory: 0 KB
// Notice: for horizontal line, don't need to check string equals to "BBBBBBBB", because it doesn't exist.
// T:O(8 * t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1742C_Stripes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String[] table = new String[8];
            String answer = "";
            for (int j = 0; j < 8; j++) {
                String row = sc.next();
                table[j] = row;
                if (!answer.isEmpty()) {
                    continue;
                }
                if ("RRRRRRRR".equals(row)) {
                    answer = "R";
                }
            }
            if (answer.isEmpty()) {
                // count vertically
                for (int j = 0; j < 8; j++) {
                    int countB = 0;
                    for (int k = 0; k < 8; k++) {
                        if (table[k].charAt(j) == 'B') {
                            countB++;
                        }
                    }
                    if (countB == 8) {
                        answer = "B";
                        break;
                    }
                }
            }

            System.out.println(answer);
        }
    }
}
