// Time: 390 ms 
// Memory: 300 KB
// 注意，用 Math.ceil() 向上取整可能丢失精度，导致少1.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1418A_Buying_Torches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt();
            long total = (long) k * (1 + y) - 1, oper1 = 0;
            oper1 = total % (x - 1) == 0 ? total / (x - 1) : (total / (x - 1) + 1);
            long ret = oper1 + k;

            System.out.println(ret);
        }
    }
}
