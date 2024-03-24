// AC: 592 ms 
// Memory: 600 KB
// Math.
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1933B_Turtle_Math_Fast_Three_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0, ret = 0;
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                sum += a;
                record.merge(a % 3, 1, Integer::sum);
            }
            if (sum % 3 != 0) {
                if (sum % 3 == 1) {
                    if (record.containsKey(1)) {
                        ret = 1;
                    } else {
                        ret = 2;
                    }
                } else {
                    // plus 1 or remove any n%3==2.
                    ret = 1;
                }
            }

            System.out.println(ret);
        }
    }
}
