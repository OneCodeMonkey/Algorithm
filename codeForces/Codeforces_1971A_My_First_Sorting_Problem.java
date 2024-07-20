// AC: 327 ms 
// Memory: 600 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1971A_My_First_Sorting_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), min = Math.min(x, y), max = Math.max(x, y);
            System.out.println(min + " " + max);
        }
    }
}
