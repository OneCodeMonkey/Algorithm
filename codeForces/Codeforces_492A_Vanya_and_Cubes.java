// AC: 186 ms 
// Memory: 0 KB
// .
// T:O(sqrt(-3, n)), S:O(1)
//
import java.util.Scanner;

public class Codeforces_492A_Vanya_and_Cubes {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), level = 1, sum = 0;
        while (sum <= n) {
            sum += (level * (level + 1)) / 2;
            level++;
        }
        System.out.println(level - 2);
    }
}
