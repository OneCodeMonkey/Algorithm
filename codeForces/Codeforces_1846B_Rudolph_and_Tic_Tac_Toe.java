// AC: 296 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1846B_Rudolph_and_Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String[] table = new String[3];
            char ret = ' ';
            for (int j = 0; j < 3; j++) {
                table[j] = sc.next();
            }
            for (char target : Arrays.asList('O', 'X', '+')) {
                for (int j = 0; j < 3; j++) {
                    if (table[j].charAt(0) == target && table[j].charAt(1) == target && table[j].charAt(2) == target) {
                        ret = target;
                        break;
                    }
                }
                if (ret != ' ') {
                    break;
                }
                for (int j = 0; j < 3; j++) {
                    if (table[0].charAt(j) == target && table[1].charAt(j) == target && table[2].charAt(j) == target) {
                        ret = target;
                        break;
                    }
                }
                if (ret != ' ') {
                    break;
                }
                if (table[0].charAt(0) == target && table[1].charAt(1) == target && table[2].charAt(2) == target) {
                    ret = target;
                    break;
                }
                if (table[0].charAt(2) == target && table[1].charAt(1) == target && table[2].charAt(0) == target) {
                    ret = target;
                    break;
                }
            }

            System.out.println(ret != ' ' ? ret : "DRAW");
        }
    }
}
