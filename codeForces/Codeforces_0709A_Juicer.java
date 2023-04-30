// AC: 467 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0709A_Juicer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt(), curWaste = 0, clearWasteTime = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a <= b) {
                curWaste += a;
                if (curWaste > d) {
                    curWaste = 0;
                    clearWasteTime++;
                }
            }
        }

        System.out.println(clearWasteTime);
    }
}
