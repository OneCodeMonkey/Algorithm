// AC: 296 ms 
// Memory: 1300 KB
// Math: Think about this equation: 4X+6Y = N, simplified as 2X+3Y=(N/2). 
// T:O(t), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1679A_AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(), min = -1, max = -1;
            boolean ret = false;
            if (n > 2 && n % 2 == 0) {
                ret = true;
                max = n / 4;
                int mod = (int) ((n / 2) % 3);
                if (mod == 0) {
                    min = n / 6;
                } else {
                    min = n / 6 + 1;
                }
            }

            System.out.println(ret ? (min + " " + max) : -1);
        }
    }
}
