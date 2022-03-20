// AC: Time: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_467A_George_and_Accommodation {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), count = 0;
        while (sc.hasNext()) {
            int p = sc.nextInt(), q = sc.nextInt();
            if (q - p >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
