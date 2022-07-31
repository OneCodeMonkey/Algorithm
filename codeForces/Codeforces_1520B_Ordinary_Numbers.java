// AC: 296 ms 
// Memory: 0 KB
// .
// T:O(sum(logn)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1520B_Ordinary_Numbers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0, expTenBase = 0, nCopy = n;
            while (nCopy >= 10) {
                expTenBase++;
                nCopy /= 10;
            }
            ret += expTenBase * 9;
            int compare = 0, base = 1;
            while (expTenBase-- >= 0) {
                compare += nCopy * base;
                base *= 10;
            }

            ret += n >= compare ? nCopy : nCopy - 1;
            System.out.println(ret);
        }
    }
}
