// AC: Time: 233 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_677A_Vanya_and_Fence {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), h = sc.nextInt(), ret = 0;
        while (sc.hasNext()) {
            int i = sc.nextInt();
            if (i > h) {
                ret += 2;
            } else {
                ret++;
            }
        }

        System.out.println(ret);
    }
}
