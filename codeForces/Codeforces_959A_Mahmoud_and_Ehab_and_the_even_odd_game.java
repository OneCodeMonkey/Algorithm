// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_959A_Mahmoud_and_Ehab_and_the_even_odd_game {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Mahmoud" : "Ehab");
    }
}
