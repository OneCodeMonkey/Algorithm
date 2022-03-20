// AC: Time: 498 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_116A_Tram {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), maxCount = 0, curCount = 0;
        while (sc.hasNext()) {
            int ai = sc.nextInt(), bi = sc.nextInt();
            curCount += bi - ai;
            maxCount = Math.max(maxCount, curCount);
        }

        System.out.println(maxCount);
    }
}
