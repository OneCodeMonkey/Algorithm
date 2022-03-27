// AC: Time: 358 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_580A_Kefa_and_First_Steps {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), maxCount = 1, curCount = 1, prev = -1;
        while (sc.hasNext()) {
            int i = sc.nextInt();
            if (prev != -1) {
                if (i >= prev) {
                    curCount++;
                    maxCount = Math.max(maxCount, curCount);
                } else {
                    curCount = 1;
                }
            }
            prev = i;
        }

        System.out.println(maxCount);
    }
}
