// Time: 342 ms 
// Memory: 1300 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2019A_Max_Plus_Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret, maxVal = 0;
            boolean maxValEvenIndex = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a > maxVal) {
                    maxVal = a;
                    maxValEvenIndex = false;
                    if (j % 2 == 0) {
                        maxValEvenIndex = true;
                    }
                } else if (a == maxVal) {
                    if (j % 2 == 0) {
                        maxValEvenIndex = true;
                    }
                }
            }
            if (n % 2 == 0) {
                ret = n / 2 + maxVal;
            } else {
                if (maxValEvenIndex) {
                    ret = maxVal + n / 2 + 1;
                } else {
                    ret = maxVal + n / 2;
                }
            }

            System.out.println(ret);
        }
    }
}
