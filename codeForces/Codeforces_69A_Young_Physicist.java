// AC: Time: 436 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_69A_Young_Physicist {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), x = 0, y = 0, z = 0, count = 0;
        while (sc.hasNext()) {
            int i = sc.nextInt();
            count++;
            if (count % 3 == 0) {
                z += i;
            } else if (count % 3 == 1) {
                x += i;
            } else {
                y += i;
            }
        }

        System.out.println((x == 0 && y == 0 && z == 0) ? "YES" : "NO");
    }
}
