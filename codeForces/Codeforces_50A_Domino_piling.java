// AC: Time: 374 ms
// Memory: 0 KB
// every even param can fill completely. when both odd, we can fill until one single square left.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_50A_Domino_piling {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt(), n = sc.nextInt();
        System.out.println(m * n / 2);
    }
}