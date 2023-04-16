// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1555A_PizzaForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(), mod6 = n % 6, left6 = n / 6, ret = 0;
            if (n < 6) {
                ret = 15;
            } else {
                if (mod6 % 2 == 1) {
                    if (mod6 == 1) {
                        ret = (left6 - 1) * 15 + 20;
                    } else if (mod6 == 3) {
                        ret = (left6 - 1) * 15 + 25;
                    } else {
                        ret = (left6 + 1) * 15;
                    }
                } else {
                    if (mod6 == 0) {
                        ret = left6 * 15;
                    } else if (mod6 == 2) {
                        ret = (left6 - 1) * 15 + 20;
                    } else if (mod6 == 4) {
                        ret = (left6 - 1) * 15 + 25;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
