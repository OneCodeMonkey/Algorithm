// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1186A_Vus_the_Cossack_and_a_Contest {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        System.out.println(Math.min(m, k) >= n ? "Yes" : "NO");
    }
}
