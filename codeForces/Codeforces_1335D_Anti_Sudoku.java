// AC: 1247 ms 
// Memory: 0 KB
// Many answers. Just replace one char to another in [1,9] is ok.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1335D_Anti_Sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 9; j++) {
                String row = sc.next();
                System.out.println(row.replace('1', '2'));
            }
        }
    }
}
