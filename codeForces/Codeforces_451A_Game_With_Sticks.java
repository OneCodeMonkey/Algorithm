// AC: 218 ms 
// Memory: 0 KB
// choose the smaller edge size, if edge is odd, then A win, otherwise M.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_451A_Game_With_Sticks {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), minEdge = Math.min(n, m);
        System.out.println(minEdge % 2 == 1 ? "Akshat" : "Malvika");
    }
}
