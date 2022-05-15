// AC: 218 ms 
// Memory: 0 KB
// brute-force
// T:O(1), S:O(1)
//
import java.util.Scanner;

public class Codeforces_732A_Buy_a_Shovel {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt(), r = sc.nextInt(), step = (k % 2 == 1 && r % 2 == 0) ? 2 : 1;
        for (int i = 0; ; i += step) {
            if ((i != 0 && (k * i) % 10 == 0) || (k * i - r) % 10 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
