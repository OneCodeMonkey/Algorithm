// AC: 233 ms 
// Memory: 0 KB
// math
// T:O(sum(logni(ki))), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1352C_K_th_Not_Divisible_by_n {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), remain = k;
            while (remain / n > 0) {
                int newAdd = remain / n;
                k += newAdd;
                remain = (remain % n) + newAdd;
            }
            System.out.println(k);
        }
    }
}
