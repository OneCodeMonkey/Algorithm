// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_723A_The_New_Year_Meeting_Friends {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c)), min = Math.min(a, Math.min(b, c));
        System.out.println(max - min);
    }
}
