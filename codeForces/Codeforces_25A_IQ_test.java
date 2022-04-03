// AC: Time: 374 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_25A_IQ_test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), countOdd = 0, countEven = 0, flag = -1, oddIndex = -1, evenIndex = -1;
        for (int i = 1; i <= n; i++) {
            int item = sc.nextInt();
            if (flag == -1) {
                if (item % 2 == 0) {
                    evenIndex = i;
                    countEven++;
                    if (countEven >= 2) {
                        if (oddIndex != -1) {
                            System.out.println(oddIndex);
                            return;
                        }
                        flag = 0;
                    }
                } else {
                    oddIndex = i;
                    countOdd++;
                    if (countOdd >= 2) {
                        if (evenIndex != -1) {
                            System.out.println(evenIndex);
                            return;
                        }
                        flag = 1;
                    }
                }
            } else {
                if ((flag == 0 && item % 2 == 1) || (flag == 1 && item % 2 == 0)) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
